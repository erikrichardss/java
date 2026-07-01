package projects.ex09.repository;

import projects.ex09.domain.Loan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LoanRepository implements Repository<Loan> {

    private List<Loan> loanList = new ArrayList<>();

    public String findTopUsersLoan() {

        return loanList.stream()
                .sorted(Comparator.comparing((Loan l) -> l.getUser().getQuantityLoanByUsers()).reversed())
                .limit(3)
                .map(Loan::toString)
                .collect(Collectors.joining("\n"));
    }

    public String findMaterialActive() {

        return loanList.stream()
                .filter(l -> l.getMaterials().isBorrowed())
                .map(Loan::toString)
                .collect(Collectors.joining("\n"));
    }

    public String findMaterialNotActive() {

        return loanList.stream()
                .filter(l -> !l.getMaterials().isBorrowed())
                .map(Loan::toString)
                .collect(Collectors.joining("\n"));
    }

    public String findUserWithDelay() {

        return loanList.stream()
                .filter(l -> l.getDateExpectedReturn().isAfter(LocalDate.now()))
                .map(Loan::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public void saveElement(Loan loan) { loanList.add(loan); }

    @Override
    public void listAll() { loanList.forEach(System.out::println); }

    @Override
    public Loan searchById(int id) {

        return loanList.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void removeElement(Loan d) { loanList.remove(d); }
}

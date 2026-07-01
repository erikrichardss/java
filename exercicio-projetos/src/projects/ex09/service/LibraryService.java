package projects.ex09.service;

import projects.ex09.domain.Loan;
import projects.ex09.domain.Materials;
import projects.ex09.domain.User;
import projects.ex09.repository.LoanRepository;
import projects.ex09.repository.MaterialsRepository;
import projects.ex09.repository.UserRepository;

import java.util.Map;

public class LibraryService {

    private LoanRepository loanRepository;
    private MaterialsRepository materialsRepository;
    private UserRepository userRepository;
    private Map<User, Integer> UserHasMaterial;

    public LibraryService(LoanRepository loanRepository,
                          MaterialsRepository materialsRepository,
                          UserRepository userRepository) {

        this.loanRepository = loanRepository;
        this.materialsRepository = materialsRepository;
        this.userRepository = userRepository;
    }

    // part of loan
    public void makeLoan(User user, Materials materials) {

        if (materials.isBorrowed())
            throw new IllegalArgumentException("Material is borrowed");

        if (userRepository.limitLoan() > 5)
            throw new IllegalArgumentException("Limit Exception");

        Loan loan = new Loan(user, materials);

        loanRepository.saveElement(loan);
    }

    public void returnLoan(Materials materials, Loan loan) {

        loanRepository.removeElement(loan);
        loan.registerReturn(materials);
    }

    public void findMaterialsActive() { loanRepository.findMaterialActive(); }

    public void findLoanById(int id) { loanRepository.searchById(id); }

    public void listAllLoan() { loanRepository.listAll(); }

    // part of material

    public void registerMaterial(Materials materials) { materialsRepository.saveElement(materials); }

    public void findMaterialByTitle(String title) { materialsRepository.finByTitle(title); }

    public void findMaterialById(int id) { materialsRepository.searchById(id); }

    public void removeMaterial(Materials materials) { materialsRepository.removeElement(materials); }

    public void listAllMaterials() { materialsRepository.listAll(); }

    // part of user

    public void registerUser(User user) { userRepository.saveElement(user); }

    public void findUserByName(String name) { userRepository.findUserByName(name); }

    public void findUserById(int id) { userRepository.searchById(id); }

    public void removeUser(User user) { userRepository.removeElement(user); }

    public void listAllUser() { userRepository.listAll(); }
}

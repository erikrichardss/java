package projects.ex09;

import projects.ex09.domain.*;
import projects.ex09.repository.LoanRepository;
import projects.ex09.repository.MaterialsRepository;
import projects.ex09.repository.UserRepository;
import projects.ex09.service.LibraryService;
import projects.ex09.service.ReportService;

import java.time.LocalDate;

public class AppLibrary {

    public static void main(String[] args) {

        Book book = new Book("The Cond of Mount Cristo", LocalDate.ofYearDay(1987, 12),
                false, "Alexandre Dumas", 1400);
        Journal journal = new Journal("New York Times", LocalDate.ofYearDay(2023, 23),
                false, 2, LocalDate.ofYearDay(2023, 01));
        ScientificArticle scientificArticle = new ScientificArticle("The Super Mind", LocalDate.ofYearDay(2025, 01),
                false, "Nicholas", "Piscicolog");
        Student student = new Student("Erik Richard", "Technolog");
        Teacher teacher = new Teacher("William", "Strong Enough");

        Loan loan = new Loan(student, book);

        // part local
        LoanRepository loanRepository = new LoanRepository();

        loanRepository.saveElement(loan);

        // part user
        UserRepository userRepository = new UserRepository();

        userRepository.saveElement(student);
        userRepository.saveElement(teacher);

        // part material
        MaterialsRepository materialsRepository = new MaterialsRepository();

        materialsRepository.saveElement(book);
        materialsRepository.saveElement(scientificArticle);
        materialsRepository.saveElement(journal);

        // part library
        LibraryService libraryService = new LibraryService(loanRepository, materialsRepository, userRepository);

        libraryService.registerMaterial(book);
        libraryService.registerMaterial(journal);
        libraryService.registerMaterial(scientificArticle);

        libraryService.registerUser(student);
        libraryService.registerUser(teacher);
        libraryService.listAllUser();

        // part report
        ReportService reportService = new ReportService(loanRepository);

        reportService.printMaterialsLoan();
        reportService.printMaterialsNotLoan();
        reportService.readTopUsersLoan();
    }
}

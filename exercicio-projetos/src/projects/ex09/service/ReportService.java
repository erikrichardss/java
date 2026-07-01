package projects.ex09.service;

import projects.ex09.repository.LoanRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReportService {

    private LoanRepository loanRepository;

    public ReportService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    private void writeMaterialsNotLoan() {

        try {

            Path path = Paths.get("materials-not-loan.txt");

            if (Files.notExists(path)) Files.createFile(path);

            Files.writeString(path, loanRepository.findMaterialActive());
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    public void printMaterialsNotLoan() {

        writeMaterialsNotLoan();

        try {

            Path path = Paths.get("materials-not-loan.txt");

            Files.readAllLines(path);
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    private void writeMaterialsLoan() {

        try {

            Path path = Paths.get("materials-loan.txt");

            if (Files.notExists(path)) Files.createFile(path);

            Files.writeString(path, loanRepository.findMaterialNotActive());
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    public void printMaterialsLoan() {

        writeMaterialsLoan();

        try {

            Path path = Paths.get("materials-loan.txt");

            Files.readAllLines(path);
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    private void writeUserWithDelay() {

        try {

            Path path = Paths.get("user-with-dalay");

            if (Files.notExists(path)) Files.createFile(path);

            Files.writeString(path, loanRepository.findUserWithDelay());
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    public void readUserWithDelay() {

        writeUserWithDelay();

        try {

            Path path = Paths.get("user-with-dalay");

            Files.readAllLines(path);
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    private void writeTopUsersLoan() {

        try {

            Path path = Paths.get("top-user.txt");

            if (Files.notExists(path)) Files.createFile(path);

            Files.writeString(path, loanRepository.findTopUsersLoan());
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    public  void readTopUsersLoan() {

        writeTopUsersLoan();

        try {

            Path path = Paths.get("top-user.txt");

            Files.readAllLines(path);
        } catch (IOException e) { throw new RuntimeException(e); }
    }
}

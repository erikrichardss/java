package projects.ex09.domain;

import java.time.LocalDate;

public class Loan {

    private int id;
    private Materials materials;
    private User user;
    private LocalDate dateLoan;
    private LocalDate dateExpectedReturn;
    private LocalDate dateReturn;

    public Loan() {}

    public Loan(User user, Materials materials) {

        if (materials.isBorrowed()) {

            throw new IllegalArgumentException("Material is already borrowed");
        }

        this.user = user;
        this.materials = materials;
        this.dateLoan = LocalDate.now();
        this.dateExpectedReturn = LocalDate.now().plusDays(20);

        this.materials.setBorrowed(true);
    }

    public void registerReturn(Materials materials) {

        if (this.dateReturn != null)
            throw new IllegalArgumentException("This loan has already been returned");

        this.dateReturn = LocalDate.now();
        materials.setBorrowed(false);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", materials=" + materials +
                ", user=" + user +
                ", dateLoan=" + dateLoan +
                ", dateExpectedReturn=" + dateExpectedReturn +
                ", dateReturn=" + dateReturn +
                '}';
    }

    public int getId() { return id; }

    public Materials getMaterials() { return materials; }

    public User getUser() { return user; }

    public LocalDate getDateLoan() { return dateLoan; }

    public LocalDate getDateExpectedReturn() { return dateExpectedReturn; }

    public LocalDate getDateReturn() { return dateReturn; }
}

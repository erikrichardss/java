package projects.ex09.domain;

import java.time.LocalDate;

public class Journal extends Materials {

    private int edition;
    private LocalDate monthPublication;

    public Journal(String title, LocalDate yearPublication, boolean borrowed, int edition, LocalDate monthPublication) {
        super(title, yearPublication, borrowed);
        this.edition = edition;
        this.monthPublication = monthPublication;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "edition=" + edition +
                ", monthPublication=" + monthPublication +
                '}';
    }

    public int getEdition() {
        return edition;
    }

    public LocalDate getMonthPublication() {
        return monthPublication;
    }
}

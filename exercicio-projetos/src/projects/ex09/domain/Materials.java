package projects.ex09.domain;

import java.time.LocalDate;

public class Materials {

    private int id = 0;
    private String title;
    private LocalDate yearPublication;
    private boolean borrowed;

    public Materials() {}

    public Materials(String title, LocalDate yearPublication, boolean borrowed) {

        this.id++;
        this.title = title;
        this.yearPublication = yearPublication;
        this.borrowed = borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYearPublication() {
        return yearPublication;
    }
}

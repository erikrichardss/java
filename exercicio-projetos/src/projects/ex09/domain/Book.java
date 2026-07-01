package projects.ex09.domain;

import java.time.LocalDate;

public class Book extends Materials {

    private String author;
    private int numberPages;

    public Book(String title, LocalDate yearPublication, boolean borrowed, String author, int numberPages) {

        super(title, yearPublication, borrowed);
        this.author = author;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }
}

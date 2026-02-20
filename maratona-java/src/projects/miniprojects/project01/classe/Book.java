package projects.miniprojects.project01.classe;

public class Book {
    private String title;
    private String author;
    private static int totalBooks;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        Book.totalBooks++;
    }

    public String getAuthor() { return this.author; }

    public String getTitle() { return this.title; }

    public static int getTotalBooks() { return totalBooks; }
}

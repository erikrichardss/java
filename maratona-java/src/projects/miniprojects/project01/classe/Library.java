package projects.miniprojects.project01.classe;

public class Library {
    private Book[] books;
    int count = 0;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        if (count < books.length) {
            this.books[count] = book;
            count++;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void listBooks() {
        System.out.println("Books in Library");
        for (int countBook = 0; countBook < this.count; countBook++) {
            System.out.println("Title: " + this.books[countBook].getTitle() +
                    " Author: " + this.books[countBook].getAuthor());
        }
    }
}

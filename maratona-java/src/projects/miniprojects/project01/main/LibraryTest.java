package projects.miniprojects.project01.main;

import projects.miniprojects.project01.classe.*;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library(5);

        Book bookOne = new Book("O Poder Do Agora", "Eckart Tole");
        Book bookTwo = new Book("Um Novo Mundo", "Eckart Tole");
        Book bookTree = new Book("Mais Esperto que o Diabo", "Napoleão Hill");

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookTree);

        library.listBooks();

        Studends studends = new Studends("Laura", 12387, "Pscicológia");
        Teacher teacher = new Teacher("Alejandra", 1242, "Pscicologia");

        studends.borrowBook(bookOne);
        teacher.borrowBook(bookTree);

        System.out.println("Total people: " + Person.getTotalPeople());
        System.out.println("Total books: " + Book.getTotalBooks());
    }
}

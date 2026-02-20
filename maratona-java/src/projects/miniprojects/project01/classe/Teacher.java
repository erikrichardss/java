package projects.miniprojects.project01.classe;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public void borrowBook(Book book) {
        System.out.println("Teacher " + getName() +
                " subject " + getSubject() +
                " work with " + book.getTitle());
    }

    public String getSubject() { return subject; }
}

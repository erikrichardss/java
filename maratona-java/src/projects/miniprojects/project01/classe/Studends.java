package projects.miniprojects.project01.classe;

public class Studends extends Person {
    private String course;

    public Studends(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public void borrowBook(Book book) {
        System.out.println("Student " + getName() +
                " get borrow " + book.getTitle());
    }

    public String getCourse() { return this.course; }
}

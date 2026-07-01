package projects.ex09.domain;

public class Student extends User {

    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

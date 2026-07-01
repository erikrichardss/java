package projects.ex09.domain;

public class Teacher extends User {

    private String department;

    public Teacher(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

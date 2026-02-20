package projects.miniprojects.project01.classe;

public class Person {
    private String name;
    private int id;
    private static int totalPeople;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        Person.totalPeople++;
    }

    public String getName() { return this.name; }

    public int getId() { return this.id; }

    public static int getTotalPeople() { return totalPeople; }
}

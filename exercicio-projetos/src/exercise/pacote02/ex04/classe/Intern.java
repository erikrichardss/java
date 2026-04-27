package exercise.pacote02.ex04.classe;

public class Intern extends Employee {

    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 0.7;
    }
}

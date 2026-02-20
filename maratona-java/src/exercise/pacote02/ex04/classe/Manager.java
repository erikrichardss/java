package exercise.pacote02.ex04.classe;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.bonus;
    }

    public double getBonus() { return this.bonus; }
}

package exercise.pacote02.ex04.main;

import exercise.pacote02.ex04.classe.Employee;
import exercise.pacote02.ex04.classe.Intern;
import exercise.pacote02.ex04.classe.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Erik", 6962.98);
        Employee manager = new Manager("Rafaela", 4567.98, 677);
        Employee intern = new Intern("Joaquim", 3443.78);

        System.out.println(employee.getName() + " Salary: " + employee.calculateSalary());
        System.out.println(manager.getName() + " Salary: " + manager.calculateSalary());
        System.out.println(intern.getName() + " Salary: " + intern.calculateSalary());

    }
}

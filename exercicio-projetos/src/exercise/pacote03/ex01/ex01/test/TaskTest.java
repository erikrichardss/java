package exercise.pacote03.ex01.ex01.test;

import exercise.pacote03.ex01.ex01.domain.Task;

public class TaskTest {

    public static void main(String[] args) {

        Task task1 = new Task("Fazer exercícios", 5);
        Task task2 = new Task("Concluir exercício", 2);

        System.out.println(task1.daysRemaining());
        System.out.println(task1.isOverdue());

        System.out.println(task2.daysRemaining());
        System.out.println(task2.isOverdue());
    }
}

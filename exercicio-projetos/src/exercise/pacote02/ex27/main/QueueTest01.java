package exercise.pacote02.ex27.main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {

    public static void main(String[] args) {

        Queue<String> pessoas = new PriorityQueue<>();

        pessoas.add("Erik");
        pessoas.add("Ana");
        pessoas.add("Mirian");
        pessoas.add("Jades");

        System.out.println(pessoas);

        pessoas.poll();
        pessoas.poll();

        System.out.println(pessoas);

        System.out.println(pessoas.peek());

        System.out.println(pessoas);

        pessoas.poll();
        pessoas.poll();

        System.out.println(pessoas.isEmpty());
    }
}

package exercise.pacote02.ex27.main;

import exercise.pacote02.ex27.classe.Task;

import java.util.*;

class taskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {

        return Integer.compare(o1.getPrioridade(), o2.getPrioridade());
    }
}

public class TaskTest01 {

    public static void main(String[] args) {

        NavigableSet<Task> taskList = new TreeSet<>(new taskComparator());

        taskList.add(new Task("Fazer a cama", 3, false));
        taskList.add(new Task("Compras", 1, true));
        taskList.add(new Task("SkinCare", 5, false));
        taskList.add(new Task("Projeto", 4, true));
        taskList.add(new Task("Malas", 2, false));

        for (Task task : taskList) {

            System.out.println(task.toString());
        }

    }
}

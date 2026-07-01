package projects.ex10.repository;

import projects.ex10.domain.Priority;
import projects.ex10.domain.Status;
import projects.ex10.domain.Task;

import java.util.*;
import java.util.stream.Collectors;

public class TaskRepository implements Repository {
    List<Task> taskList = new ArrayList<>();

    @Override
    public void registerTask(Task task) {
        taskList.add(task);
    }

    @Override
    public String listAllTask() {
        return taskList.stream().
                map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public Optional<String> findTaskById(Integer id) {
        return taskList.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(Task::toString)
                .orElse("Cannot possible find this task")
                .describeConstable();
    }

    @Override
    public void completeTask(Task task) {
        if (task.getStatus().equals(Status.COMPLETE)) return;

        taskList.stream()
                .filter(t -> t.equals(task))
                .forEach(t -> t.setStatus(Status.COMPLETE));
    }

    @Override
    public void removeTask(Task task) {
        boolean remove = taskList.remove(task);
        if (remove) {
            System.out.println("Task removed");
        }
    }

    @Override
    public String listTaskPending() {
        return taskList.stream()
                .filter(t -> t.getStatus().equals(Status.PENDING))
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String listAllTaskCompleted() {
        return taskList.stream()
                .filter(t -> t.getStatus().equals(Status.COMPLETE))
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public void listTaskByPriority() {
        Map<Priority, List<Task>> priorityListMap = taskList.stream()
                .collect(Collectors.groupingBy(Task::getPriority));
        priorityListMap.forEach((p, t) -> System.out.println(p + ": " + t));
    }

    @Override
    public String orderTaskByDateCreation() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getDateCreation))
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public Optional<String> findOldTask() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getDateCreation).reversed())
                .map(Task::toString)
                .findFirst();
    }
}

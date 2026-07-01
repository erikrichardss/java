package projects.ex10.repository;

import projects.ex10.domain.Task;

import java.util.Optional;

public interface Repository <T extends Task> {
    void registerTask(T t);

    String listAllTask();

    Optional<String> findTaskById(Integer id);

    void completeTask(T t);

    void removeTask(T t);

    String listTaskPending();

    String listAllTaskCompleted();

    void listTaskByPriority();

    String orderTaskByDateCreation();

    Optional<String> findOldTask();
}

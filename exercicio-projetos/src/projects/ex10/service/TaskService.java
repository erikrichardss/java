package projects.ex10.service;

import projects.ex10.domain.Task;
import projects.ex10.repository.TaskRepository;

import java.util.Optional;

public class TaskService {
    TaskRepository taskRepository;

    public TaskService() { taskRepository = new TaskRepository(); }

    public void registerTask(Task task) { taskRepository.registerTask(task); }

    public String listAllTask() { return taskRepository.listAllTask(); }

    public Optional<String> findTaskById(int id) { return taskRepository.findTaskById(id); }

    public void completeTask(Task task) { taskRepository.completeTask(task); }

    public void removeTask(Task task) { taskRepository.removeTask(task); }

    public String listTaskPending() { return taskRepository.listTaskPending(); }

    public String listAllTaskCompleted() { return taskRepository.listAllTaskCompleted(); }

    public void listTaskByPriority() { taskRepository.listTaskByPriority(); }

    public String orderTaskByDateCreation() { return taskRepository.orderTaskByDateCreation(); }

    public Optional<String> findOldTask() { return taskRepository.findOldTask(); }


}

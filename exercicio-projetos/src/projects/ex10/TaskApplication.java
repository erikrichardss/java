package projects.ex10;

import projects.ex10.domain.Priority;
import projects.ex10.domain.Task;
import projects.ex10.service.TaskService;

public class TaskApplication {
    public static void main(String[] args) {
        Task t1 = new Task("Make a cake", "cake is good", Priority.HIGH);
        Task t2 = new Task("Make a lunch", "I'm hungry", Priority.HIGH);
        Task t3 = new Task("Clean my house", "It's dirty", Priority.LOW);
        Task t4 = new Task("Drink a water", "I'm thirsty", Priority.LOW);
        Task t5 = new Task("Study for my test", "I have a test in November", Priority.MEDIUM);
        Task t6 = new Task("I need to run", "I need to run for my competition", Priority.LOW);

        TaskService taskService = new TaskService();

        taskService.registerTask(t1);
        taskService.registerTask(t2);
        taskService.registerTask(t3);
        taskService.registerTask(t4);
        taskService.registerTask(t5);
        taskService.registerTask(t6);

        System.out.println("----------listAllTask");
        System.out.println(taskService.listAllTask());
        System.out.println("----------findTaskById");
        System.out.println(taskService.findTaskById(2));
        System.out.println("----------completeTask");
        taskService.completeTask(t3);
        taskService.completeTask(t4);
        System.out.println(taskService.findTaskById(3));
        System.out.println(taskService.findTaskById(4));
        System.out.println(taskService.findTaskById(4));
        System.out.println("----------removeTask");
        taskService.removeTask(t1);
        System.out.println(taskService.findTaskById(1));
        System.out.println("----------listTaskPending");
        System.out.println(taskService.listTaskPending());
        System.out.println("----------listAllTaskCompleted");
        System.out.println(taskService.listAllTaskCompleted());
        System.out.println("----------listAllTaskCompleted");
        taskService.listTaskByPriority();
        System.out.println("----------orderTaskByDateCreation");
        System.out.println(taskService.orderTaskByDateCreation());
        System.out.println("----------findOldTask");
        System.out.println(taskService.findOldTask());
    }
}

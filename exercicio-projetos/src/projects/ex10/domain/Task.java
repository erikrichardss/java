package projects.ex10.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private Integer id = 0;
    private String title;
    private String description;
    private Priority priority;
    private LocalDate dateCreation;
    private Status status;

    public Task(String title, String description, Priority priority) {
        if (title.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("This attribution cannot be null");
        }
        this.priority = priority;
        this.description = description;
        this.title = title;
        id = idCounter.getAndIncrement();
//        id = ThreadLocalRandom.current().nextInt();
        status = Status.PENDING;
        dateCreation = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Task - " +
                "id: " + id +
                ", title: '" + title +
                ", description: '" + description +
                ", priority: " + priority +
                ", dateCreatio: " + dateCreation +
                ", status: " + status;
    }

    public void setPriority(Priority priority) { this.priority = priority; }

    public void setStatus(Status status) { this.status = status; }

    public Integer getId() { return id; }

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public Priority getPriority() { return priority; }

    public LocalDate getDateCreation() { return dateCreation; }

    public Status getStatus() { return status; }
}

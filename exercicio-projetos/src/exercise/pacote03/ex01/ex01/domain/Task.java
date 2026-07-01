package exercise.pacote03.ex01.ex01.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task {

    private String name;
    private LocalDate creationDate;
    private LocalDate deadline;

    public Task(String name, int plusDaysForTask) {

        this.name = name;
        this.creationDate = LocalDate.now();
        this.deadline = creationDate.plusDays(plusDaysForTask);
    }

    public boolean isOverdue() {

        return LocalDate.now().isAfter(deadline);
    }

    public long daysRemaining() {

        return ChronoUnit.DAYS.between(LocalDate.now(), deadline);
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}

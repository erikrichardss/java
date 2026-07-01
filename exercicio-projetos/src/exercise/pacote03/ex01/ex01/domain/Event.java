package exercise.pacote03.ex01.ex01.domain;

import java.time.LocalDateTime;

public class Event {

    private String description;
    private LocalDateTime timestamp;

    public Event(String description) {

        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    public String formatEvent() {

        return getTimestamp().toString() + " - " + getDescription() + "\n";
    }

    public String getDescription() { return description; }

    public LocalDateTime getTimestamp() { return timestamp; }
}

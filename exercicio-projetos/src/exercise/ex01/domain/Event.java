package exercise.ex01.domain;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

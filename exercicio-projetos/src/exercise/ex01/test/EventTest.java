package exercise.ex01.test;

import exercise.ex01.domain.Event;
import exercise.ex01.domain.EventLogger;

public class EventTest {

    public static void main(String[] args) {

        Event event1 = new Event("Started project");
        Event event2 = new Event("Fixed bug");
        Event event3 = new Event("Studied Java IO");

        EventLogger eventLogger = new EventLogger();

        eventLogger.logEvent(event1);
        eventLogger.logEvent(event2);
        eventLogger.logEvent(event3);

        eventLogger.readEvents();
    }
}

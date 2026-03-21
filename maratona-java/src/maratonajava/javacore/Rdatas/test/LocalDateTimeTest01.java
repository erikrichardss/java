package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ltd2);
    }
}

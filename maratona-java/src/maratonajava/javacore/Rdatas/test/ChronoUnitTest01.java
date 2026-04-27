package maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversário = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversário, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversário, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversário, now));
        System.out.println(ChronoUnit.YEARS.between(aniversário, now));
    }
}

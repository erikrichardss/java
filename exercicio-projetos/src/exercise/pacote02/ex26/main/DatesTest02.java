package exercise.pacote02.ex26.main;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DatesTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterSomeDays = LocalDate.now().plusDays(20);
        System.out.println(ChronoUnit.DAYS.between(now, afterSomeDays));

        Instant start = Instant.ofEpochSecond(1);
        Instant afterSomeTime = Instant.ofEpochSecond(1_000_000);
        System.out.println(Duration.between(start, afterSomeTime));

        String stringDate = "2005-08-15";
        LocalDate date = LocalDate.parse(stringDate);
        LocalDate dateNow = LocalDate.now();
        System.out.println(Period.between(date, dateNow));


        LocalTime timeBefore = LocalTime.of(10,30);
        LocalTime timeAfter = LocalTime.of(15,45);
        System.out.println(Duration.between(timeBefore, timeAfter));

        DatesTest02.calcularDatas();
    }

    public static void calcularDatas() {
        String stringFutureDate = "2026-12-31";
        LocalDate futureDate = LocalDate.parse(stringFutureDate);
        LocalDate now = LocalDate.now();

        long calulateDate = ChronoUnit.DAYS.between(now, futureDate);

        if (calulateDate < 10) {
            System.out.println("Urgente");
        } else if (calulateDate >= 10 && calulateDate <= 30) {
            System.out.println("Atenção");
        } else if (calulateDate > 30) {
            System.out.println("Tranquilo");
        }

        System.out.println(calulateDate);
        System.out.println(Period.between(now, futureDate));
    }
}

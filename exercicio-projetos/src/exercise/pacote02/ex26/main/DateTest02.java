package exercise.pacote02.ex26.main;

import java.time.*;
import java.time.temporal.*;
import java.util.Map;

class nextDayUtil implements TemporalAdjuster {


    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int daysForNextDayUtil;

        switch (dayOfWeek) {
            case FRIDAY:
                daysForNextDayUtil = 3;
                break;
            case SATURDAY:
                daysForNextDayUtil = 2;
                break;
            default:
                daysForNextDayUtil = 1;
                break;
        }

        return temporal.plus(daysForNextDayUtil, ChronoUnit.DAYS);
    }
}

public class DateTest02 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        LocalDateTime localDateTime = LocalDateTime.now();

        ZoneId brasilHorario = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTime = localDateTime.atZone(brasilHorario);

        System.out.println(shortIds);
        System.out.println("Brasil: " + zonedDateTime);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(tokyo);

        System.out.println("Tokyo: " + zonedDateTime1);

        ZonedDateTime nowNovaYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Nova York" + nowNovaYork);

        System.out.println("------------------------------");

        LocalDate getDayUtil;

        getDayUtil = LocalDate.now().with(new nextDayUtil());
        System.out.println(getDayUtil);

        getDayUtil = LocalDate.now().withDayOfMonth(28).with(new nextDayUtil());
        System.out.println(getDayUtil);

        getDayUtil = LocalDate.now().withDayOfMonth(29).with(new nextDayUtil());
        System.out.println(getDayUtil);

        getDayUtil = LocalDate.now().withDayOfMonth(30).with(new nextDayUtil());
        System.out.println(getDayUtil);

        getDayUtil = LocalDate.now().withDayOfMonth(31).with(new nextDayUtil());
        System.out.println(getDayUtil);

        System.out.println("--------------------------");

        LocalDate now;

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
        System.out.println(now);
    }
}

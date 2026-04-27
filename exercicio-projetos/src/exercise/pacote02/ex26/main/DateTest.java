package exercise.pacote02.ex26.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {
        public static void main(String[] args) {
//        Date date = new Date(1773745559789L);
//        System.out.println(date);

//        Calendar calendar = Calendar.getInstance();
//
//        System.out.println(calendar.getFirstDayOfWeek());
//        System.out.println();

//            Locale localeItaly = Locale.ITALY;
//            Calendar calendar = Calendar.getInstance();
//            DateFormat dateFormatItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
//            System.out.println(dateFormatItaly.format(calendar.getTime()));

//            String dateFormat = "dd'/'MM'/'yyyy HH':'mm";
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
//
//            Date date = new Date();
//
//            System.out.println(simpleDateFormat.format(date));
//            System.out.println(date);

//            String dateFormat = "10/04/2026";
//            Locale localeBR = Locale.forLanguageTag("pt-br");
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
//
//            try {
//                Date date = simpleDateFormat.parse(dateFormat);
//                System.out.println(date);
//            } catch (ParseException e) {
//                throw new RuntimeException(e);
//            }

           SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MM'/'yyyy");

            Date date = null;
            try {
                date = sdf.parse("15/03/2026");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            Calendar calendar = Calendar.getInstance();

           calendar.setTime(date);

           calendar.add(Calendar.DAY_OF_MONTH, 10);

           Date novaData = calendar.getTime();

            System.out.println(sdf.format(novaData));
        }
}
package maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1773742533621L); // long 1000000
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);
    }
}

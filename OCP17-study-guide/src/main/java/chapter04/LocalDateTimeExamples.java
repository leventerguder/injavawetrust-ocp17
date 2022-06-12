package chapter04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExamples {

    public static void main(String[] args) {

        var date1 = LocalDate.of(2022, Month.JUNE, 12);
        var time1 = LocalTime.of(6, 15);    // hour and minute

        var todayNow = LocalDateTime.now();

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(2022, 1, 20, 6, 15, 30);
        var dateTime3 = LocalDateTime.of(date1, time1);


        System.out.println(todayNow);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }
}

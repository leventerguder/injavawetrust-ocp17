package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeManipulatingDateAndTime {

    public static void main(String[] args) {

        var date = LocalDate.of(2024, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); //2024-01-20T05:15

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2024-01-19T05:15

        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2024-01-18T19:15

        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2024–01–18T19:14:30
    }
}

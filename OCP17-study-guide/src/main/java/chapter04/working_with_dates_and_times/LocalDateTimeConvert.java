package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeConvert {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2025, Month.OCTOBER, 1, 20, 10, 0);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println();
        System.out.println("LocalDateTime : " + localDateTime);
        System.out.println("Date : " + localDate);
        System.out.println("Time : " + localTime);

    }
}

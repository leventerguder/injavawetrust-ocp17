package chapter11.formatting_values.formatting_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimerFormatterExamples {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.getDayOfWeek()); // THURSDAY
        System.out.println(date.getMonth()); // OCTOBER
        System.out.println(date.getYear()); // 2022
        System.out.println(date.getDayOfYear()); // 293

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}

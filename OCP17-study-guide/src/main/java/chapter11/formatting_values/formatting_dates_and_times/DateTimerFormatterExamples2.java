package chapter11.formatting_values.formatting_dates_and_times;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimerFormatterExamples2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);

        date.format(DateTimeFormatter.ISO_LOCAL_TIME); // RuntimeException

    }
}

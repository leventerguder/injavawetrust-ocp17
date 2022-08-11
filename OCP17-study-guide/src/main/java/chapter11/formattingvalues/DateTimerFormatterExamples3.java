package chapter11.formattingvalues;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimerFormatterExamples3 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(11, 12, 34);

        time.format(DateTimeFormatter.ISO_LOCAL_DATE); // RuntimeException
    }
}

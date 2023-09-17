package chapter11.formatting_values;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimerFormatterExamples3 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(11, 12, 34);

        time.format(DateTimeFormatter.ISO_LOCAL_DATE); // RuntimeException
    }
}

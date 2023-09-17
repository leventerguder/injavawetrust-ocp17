package chapter11.formatting_values;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AddingCustomTextValuesExamples3 {
    public static void main(String[] args) {

        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var f = DateTimeFormatter.ofPattern("'Time is: hh:mm: "); // Exception thrown
        // Pattern ends with an incomplete string literal: 'Time is: hh:mm:
        System.out.println(dt.format(f));

    }
}

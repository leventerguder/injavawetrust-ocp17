package chapter11.formattingvalues;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AddingCustomTextValuesExamples2 {
    public static void main(String[] args) {

        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var f = DateTimeFormatter.ofPattern("The time is hh:mm"); // Exception thrown
        // Unknown pattern letter: T
        System.out.println(dt.format(f));

    }
}

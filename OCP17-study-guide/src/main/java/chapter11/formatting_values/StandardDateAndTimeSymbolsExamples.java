package chapter11.formatting_values;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StandardDateAndTimeSymbolsExamples {

    public static void main(String[] args) {

        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1)); // 10/20/2022 06:15:30

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2)); // 10_2022_-_20

//        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3)); // DateTimeException

        // The third example throws an exception at runtime because the underlying LocalDateTime does not have a time zone specified.

        var formatter4 = DateTimeFormatter.ofPattern("h:mm z");
        System.out.println(ZonedDateTime.now().format(formatter4));
    }
}

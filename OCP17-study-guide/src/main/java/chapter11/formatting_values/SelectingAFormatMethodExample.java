package chapter11.formatting_values;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class SelectingAFormatMethodExample {

    public static void main(String[] args) {

        var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dateTime.format(formatter)); // 10/20/2022 06:15:30
        System.out.println(formatter.format(dateTime)); // 10/20/2022 06:15:30

    }
}

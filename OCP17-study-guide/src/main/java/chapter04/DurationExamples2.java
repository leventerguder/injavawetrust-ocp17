package chapter04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExamples2 {

    public static void main(String[] args) {

        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var duration = Duration.ofHours(6);

        System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
        System.out.println(time.plus(duration)); // 12:15
        System.out.println(date.plus(duration)); // UnsupportedTemporalTypeException
    }

}

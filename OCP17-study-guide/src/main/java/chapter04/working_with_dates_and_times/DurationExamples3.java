package chapter04.working_with_dates_and_times;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExamples3 {

    public static void main(String[] args) {

        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var duration = Duration.ofHours(23);

        System.out.println(dateTime.plus(duration)); // 2022–01–21T05:15

        var duration2 = Duration.ofDays(365);

        System.out.println(dateTime.plus(duration2)); // 2023–01–21T06:15


        System.out.println(time.plus(duration)); // 05:15
        // System.out.println(date.plus(duration)); // UnsupportedTemporalTypeException
        System.out.println(time.plus(duration2));// 6:15
    }

}

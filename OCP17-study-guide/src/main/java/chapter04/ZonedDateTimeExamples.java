package chapter04;

import java.time.*;

public class ZonedDateTimeExamples {

    public static void main(String[] args) {

        var date1 = LocalDate.of(2022, Month.JUNE, 12);
        var time1 = LocalTime.of(6, 15);    // hour and minute
        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);

        var zone = ZoneId.of("US/Eastern");

        var currentZone = ZonedDateTime.now();
        var zoned1 = ZonedDateTime.of(2022, 1, 20,
                6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);


        System.out.println(currentZone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);
    }
}

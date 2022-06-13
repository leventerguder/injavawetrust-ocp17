package chapter04;

import java.time.*;

public class DayLightFallExample {

    public static void main(String[] args) {

        /*
        Similarly, in November, an hour after the initial 1:30 a.m. is also 1:30 a.m. because at 2:00 a.m.
        we repeat the hour. This time, try to calculate the GMT time yourself for all three times to confirm that
        we really do move only one hour at a time.
         */

        var date = LocalDate.of(2022, Month.NOVEMBER, 6);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2022-11-06T01:30-04:00[US/Eastern]

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2022-11-06T01:30-05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2022-11-06T02:30-05:00[US/Eastern]


    }
}

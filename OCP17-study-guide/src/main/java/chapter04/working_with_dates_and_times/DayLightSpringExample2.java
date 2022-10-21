package chapter04.working_with_dates_and_times;

import java.time.*;

public class DayLightSpringExample2 {

    public static void main(String[] args) {

        /*
        Java is smart enough to know that there is no 2:30 a.m. that night and switches over to the appropriate GMT offset.
         */

        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(2, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2022–03–13T03:30–04:00[US/Eastern]
    }
}

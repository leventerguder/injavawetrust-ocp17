package chapter04.working_with_dates_and_times;

import java.time.*;

public class DayLightSpringExample {

    public static void main(String[] args) {

        /*
        For example, on March 13, 2022, we move our clocks forward an hour and jump from 2:00 a.m. to 3:00 a.m.
        This means that there is no 2:30 a.m. that day.
         If we wanted to know the time an hour later than 1:30, it would be 3:30.
         */

        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
        System.out.println(dateTime.getHour()); // 1
        System.out.println(dateTime.getOffset()); // -05:00


        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]
        System.out.println(dateTime.getHour()); // 3
        System.out.println(dateTime.getOffset()); // -04:00

        // Notice that two things change in this example. The time jumps from 1:30 to 3:30. The UTC offset also changes.
    }
}

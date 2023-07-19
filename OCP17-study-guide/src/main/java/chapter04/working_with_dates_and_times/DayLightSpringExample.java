package chapter04.working_with_dates_and_times;

import java.time.*;

public class DayLightSpringExample {

    public static void main(String[] args) {

        /*
        For example, on March 13, 2022, we move our clocks forward an hour and jump from 2:00 a.m. to 3:00 a.m.
        This means that there is no 2:30 a.m. that day.
         If we wanted to know the time an hour later than 1:30, it would be 3:30.
         */

        System.out.println("---------- US/Eastern 2022 ----------");

        var date1 = LocalDate.of(2022, Month.MARCH, 10);
        var date2 = LocalDate.of(2022, Month.MARCH, 13);
        var date3 = LocalDate.of(2022, Month.MARCH, 20);

        printDaylightSavingTime(date1, ZoneId.of("US/Eastern"));
        printDaylightSavingTime(date2, ZoneId.of("US/Eastern"));
        printDaylightSavingTime(date3, ZoneId.of("US/Eastern"));

        // Notice that two things change in this example. The time jumps from 1:30 to 3:30. The UTC offset also changes.

        System.out.println("---------- US/Eastern 2023 ----------");

        var date4 = LocalDate.of(2023, Month.MARCH, 10);
        var date5 = LocalDate.of(2023, Month.MARCH, 12);
        var date6 = LocalDate.of(2023, Month.MARCH, 20);

        printDaylightSavingTime(date4, ZoneId.of("US/Eastern"));
        printDaylightSavingTime(date5, ZoneId.of("US/Eastern"));
        printDaylightSavingTime(date6, ZoneId.of("US/Eastern"));

        System.out.println("---------- Europe/Berlin 2023 ----------");

        var date7 = LocalDate.of(2023, Month.MARCH, 12);
        var date8 = LocalDate.of(2023, Month.MARCH, 26);
        var date9 = LocalDate.of(2023, Month.MARCH, 28);

        printDaylightSavingTime(date7, ZoneId.of("Europe/Berlin"));
        printDaylightSavingTime(date8, ZoneId.of("Europe/Berlin"));
        printDaylightSavingTime(date9, ZoneId.of("Europe/Berlin"));

        System.out.println("---------- Europe/London 2023 ----------");

        var date10 = LocalDate.of(2023, Month.MARCH, 12);
        var date11 = LocalDate.of(2023, Month.MARCH, 26);
        var date12 = LocalDate.of(2023, Month.MARCH, 28);

        // UK change time 1.00AM
        // US and Europe/Berlin 2.00AM
        printDaylightSavingTimeForUK(date10, ZoneId.of("Europe/London"));
        printDaylightSavingTimeForUK(date11, ZoneId.of("Europe/London"));
        printDaylightSavingTimeForUK(date12, ZoneId.of("Europe/London"));

    }

    private static void printDaylightSavingTime(LocalDate date, ZoneId zone) {

        System.out.println("##############");

        var time = LocalTime.of(1, 30);
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("dateTime : " + dateTime);
        System.out.println("hour : " + dateTime.getHour() + " , offset : " + dateTime.getOffset());

        dateTime = dateTime.plusHours(1);
        System.out.println("dateTime : " + dateTime);
        System.out.println("hour : " + dateTime.getHour() + " , offset : " + dateTime.getOffset());
    }

    private static void printDaylightSavingTimeForUK(LocalDate date, ZoneId zone) {

        System.out.println("##############");

        var time = LocalTime.of(00, 30);
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("dateTime : " + dateTime);
        System.out.println("hour : " + dateTime.getHour() + " , offset : " + dateTime.getOffset());

        dateTime = dateTime.plusHours(1);
        System.out.println("dateTime : " + dateTime);
        System.out.println("hour : " + dateTime.getHour() + " , offset : " + dateTime.getOffset());
    }
}

package chapter04.working_with_dates_and_times;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExamples2 {

    public static void main(String[] args) throws InterruptedException {

        var date = LocalDate.of(2022, 5, 25);
        var time = LocalTime.of(11, 55, 00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z
        System.out.println("zonedDateTime : " + zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
        System.out.println("instant : " + instant); // 202–05–25T15:55:00Z


        ZonedDateTime istanbulZonedDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Istanbul"));

        System.out.println("istanbulZonedDateTime : " + istanbulZonedDateTime);
        System.out.println("instant : " + istanbulZonedDateTime.toInstant());
        System.out.println("truncatedTo : " + (instant.truncatedTo(ChronoUnit.HOURS)));

        Instant parsed = Instant.parse("2000-06-01T10:15:20.00Z");
        System.out.println("parsed: " + parsed);


    }
}

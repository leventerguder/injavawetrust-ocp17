package chapter04.questions.q20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.Month.*;

public class Q20 {

    public static void main(String[] args) {

        // Note that March 13, 2022 is the weekend that clocks spring ahead for daylight saving time.

        var date = LocalDate.of(2022, MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime1 = ZonedDateTime.of(date, time, zone);
        var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

        long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int hour = dateTime2.getHour();
        boolean offset = dateTime1.getOffset()
                == dateTime2.getOffset();

        System.out.println("diff = " + diff);  // diff = 1
        System.out.println("hour = " + hour); // hour = 3
        System.out.println("offset = " + offset);  // offset = false


    }
}

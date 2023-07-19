package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTruncatedTo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(3, 12, 45);
        System.out.println(time); // 03:12:45
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12


        LocalDate date = LocalDate.of(2023, 1, 1);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        System.out.println(localDateTime);
        System.out.println(localDateTime.truncatedTo(ChronoUnit.HOURS));
        System.out.println(localDateTime.truncatedTo(ChronoUnit.MINUTES));

    }
}

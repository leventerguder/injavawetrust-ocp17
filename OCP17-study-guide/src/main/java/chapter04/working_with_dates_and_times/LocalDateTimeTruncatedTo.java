package chapter04.working_with_dates_and_times;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTruncatedTo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(3, 12, 45);
        System.out.println(time); // 03:12:45
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12


    }
}

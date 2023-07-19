package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitBetween {

    public static void main(String[] args) {

        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        var date = LocalDate.of(2016, 1, 20);
        var date2 = LocalDate.of(2016, 1, 22);
        var date3 = LocalDate.of(2017, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        //System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

        System.out.println(ChronoUnit.DAYS.between(date, date2)); // 2
        System.out.println(ChronoUnit.DAYS.between(date2, date)); // -2
        System.out.println(ChronoUnit.DAYS.between(date, date)); // 0
        System.out.println(ChronoUnit.MONTHS.between(date, date2)); // 0
        System.out.println(ChronoUnit.MONTHS.between(date, date3)); // 12
    }
}

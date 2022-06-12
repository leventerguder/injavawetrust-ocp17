package chapter04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitBetween {

    public static void main(String[] args) {

        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        var date = LocalDate.of(2016, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
    }
}

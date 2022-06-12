package chapter04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodVsDuration {

    public static void main(String[] args) {


        var date = LocalDate.of(2022, 5, 25);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);

        System.out.println(date.plus(period)); // 2022–05–26
        System.out.println(date.plus(days)); // Unsupported unit: Seconds

    }
}

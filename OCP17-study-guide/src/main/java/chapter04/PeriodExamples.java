package chapter04;

import java.time.Period;

public class PeriodExamples {

    public static void main(String[] args) {

        var annually = Period.ofYears(1); // every 1 year
        var quarterly = Period.ofMonths(3); // every 3 months
        var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        var everyOtherDay = Period.ofDays(2); // every 2 days
        var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

        System.out.println(annually); // P1Y
        System.out.println(quarterly);  // P3M
        System.out.println(everyThreeWeeks); // P21D
        System.out.println(everyOtherDay);  // P2D
        System.out.println(everyYearAndAWeek); // P1Y7D

        // There’s one catch. You cannot chain methods when creating a Period.
        var wrong = Period.ofYears(1).ofWeeks(1); // every week

        // This tricky code is really like writing the following:
        // var wrong = Period.ofYears(1);
        // wrong = Period.ofWeeks(1);

    }
}

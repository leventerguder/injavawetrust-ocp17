package chapter04.questions.q03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q03 {

    public static void main(String[] args) {

        method1();
        // method2(); // DateTimeException
        method3();
        method4();
        // method5(); // java.time.DateTimeException: Invalid date 'February 29' as '2023' is not a leap year
        method6();

    }

    private static void method1() {
        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2022, 3, 13);
        var time = LocalTime.of(2, 15);
        var z = ZonedDateTime.of(date, time, zone);
    }

    private static void method2() {
        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2022, 3, 40); // DateTimeException
        var time = LocalTime.of(2, 15);
        var z = ZonedDateTime.of(date, time, zone);
    }

    private static void method3() {
        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2022, 11, 6);
        var time = LocalTime.of(2, 15);
        var z = ZonedDateTime.of(date, time, zone);
    }

    private static void method4() {
        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2022, 11, 7);
        var time = LocalTime.of(2, 15);
        var z = ZonedDateTime.of(date, time, zone);
    }

    private static void method5() {
        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2023, 2, 29);
        var time = LocalTime.of(2, 15);
        var z = ZonedDateTime.of(date, time, zone);
    }

    private static void method6() {
//        var zone = ZoneId.of("US/Eastern");
//        var date = LocalDate.of(2022, MonthEnum.MARCH, 13); // DOES NOT COMPILE
//        var time = LocalTime.of(2, 15);
//        var z = ZonedDateTime.of(date, time, zone);
    }
}

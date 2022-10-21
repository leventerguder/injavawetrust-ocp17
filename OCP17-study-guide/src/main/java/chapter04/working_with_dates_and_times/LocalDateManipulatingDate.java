package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulatingDate {

    public static void main(String[] args) {

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date); //2022-01-20

        date = date.plusDays(2); // 2022-01-22
        System.out.println(date);

        date = date.plusWeeks(1); //2022-01-29
        System.out.println(date);

        date = date.plusMonths(1); //2022-02-28
        System.out.println(date);

        // Java is smart enough to realize that February 29, 2022 does not exist, and it gives us February 28, 2022, instead.

        date = date.plusYears(5); // 2027-02-28
        System.out.println(date);
    }
}

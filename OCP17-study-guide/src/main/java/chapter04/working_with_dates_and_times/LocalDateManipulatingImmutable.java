package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulatingImmutable {

    public static void main(String[] args) {

        var date = LocalDate.of(2024, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);

        // It prints January 20, 2024. Adding 10 days was useless because the program ignored the result.

    }
}

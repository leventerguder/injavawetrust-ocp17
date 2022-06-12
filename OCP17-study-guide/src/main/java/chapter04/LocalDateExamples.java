package chapter04;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExamples {

    public static void main(String[] args) {

        var today = LocalDate.now();
        var date1 = LocalDate.of(2022, Month.JUNE, 12);
        var date2 = LocalDate.of(2022, 5, 20);


        System.out.println(today);
        System.out.println(date1);
        System.out.println(date2);
    }
}

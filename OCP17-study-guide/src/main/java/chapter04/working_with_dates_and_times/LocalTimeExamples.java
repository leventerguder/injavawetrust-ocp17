package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExamples {

    public static void main(String[] args) {

        var now = LocalDate.now();
        var time1 = LocalTime.of(6, 15);    // hour and minute
        var time2 = LocalTime.of(6, 15, 30); // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds


        System.out.println(now);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);


    }
}

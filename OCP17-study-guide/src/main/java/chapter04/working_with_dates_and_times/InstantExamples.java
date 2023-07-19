package chapter04.working_with_dates_and_times;

import java.time.Duration;
import java.time.Instant;

public class InstantExamples {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("executing....");
        var now = Instant.now();
        // do something time consuming
        Thread.sleep(1000);

        var later = Instant.now();

        var duration = Duration.between(now, later);

        System.out.println(duration);
        System.out.println(duration.toMillis()); // Returns number milliseconds


    }
}

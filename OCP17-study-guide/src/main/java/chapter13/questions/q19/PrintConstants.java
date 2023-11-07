package chapter13.questions.q19;

import java.util.concurrent.*;
import java.util.stream.*;

public class PrintConstants {
    public static void main(String[] args) {
        var s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159, 2.71828) // b1
                .forEach(c -> s.submit( // b2
                        () -> System.out.println(10 * c))); // b3
        s.execute(() -> System.out.println("Printed"));
    }

    // E. It compiles, but the output cannot be determined ahead of time.
    // G. It compiles but waits forever at runtime.
}
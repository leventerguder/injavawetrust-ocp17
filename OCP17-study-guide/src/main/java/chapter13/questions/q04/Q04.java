package chapter13.questions.q04;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q04 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadScheduledExecutor();

//        service.scheduleWithFixedDelay(() -> {  // DOES NOT COMPILE
//            System.out.println("Open Zoo"); return null;
//        }, 0, 1, TimeUnit.MINUTES);

        var result = service.submit(() -> System.out.println("Wake Staff"));
        System.out.println(result.get());
    }
}

package chapter13.creating_threads_with_the_concurrency_api.submitting_tasks;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmittingTaskExample2 {

    public static void main(String[] args) {

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                sum = sum + i;
            }
            return sum;
        };

        Callable<Integer> task2 = () -> new Random().nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            List<Future<Integer>> futures = executorService.invokeAll(List.of(task, task2));
            for (Future<Integer> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

}

package chapter13.creating_threads_with_the_concurrency_api.submitting_tasks;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmittingTaskExample3 {

    public static void main(String[] args) {

        Callable<Integer> task1 = () -> 100;

        Callable<Integer> task2 = () -> 200;

        Callable<Integer> task3 = () -> 300;

        Callable<Integer> task4 = () -> 400;

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            Integer i = executorService.invokeAny(List.of(task1, task2, task3, task4));
            System.out.println(i);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

}

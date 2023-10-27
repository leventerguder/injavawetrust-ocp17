package chapter13.creating_threads_with_the_concurrency_api.increasing_concurrency_with_pools;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewFixedThreadPoolExample3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> {
            System.out.println("Task-1 , Thread#name : " + Thread.currentThread().getName());
            return "task1#done";
        };

        Callable<String> task2 = () -> {
            System.out.println("Task-2 , Thread#name : " + Thread.currentThread().getName());
            return "task2#done";
        };

        Callable<String> task3 = () -> {
            System.out.println("Task-3 , Thread#name : " + Thread.currentThread().getName());
            return "task3#done";
        };

        Callable<String> task4 = () -> {
            System.out.println("Task-4 , Thread#name : " + Thread.currentThread().getName());
            return "task4#done";
        };

        Callable<String> task5 = () -> {
            System.out.println("Task-5 , Thread#name : " + Thread.currentThread().getName());
            return "task5#done";
        };

        Callable<String> task6 = () -> {
            System.out.println("Task-6 , Thread#name : " + Thread.currentThread().getName());
            return "task6#done";
        };

        Callable task7 = () -> {
            System.out.println("Task-7 , Thread#name : " + Thread.currentThread().getName());
            return "task7#done";
        };


        List<Callable<String>> tasks = List.of(task1, task2, task3, task4, task5, task6, task7);

        String result  = executorService.invokeAny(tasks);
        System.out.println(result);

        executorService.shutdown();


    }
}

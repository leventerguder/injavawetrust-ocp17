package chapter13.creating_threads_with_the_concurrency_api.increasing_concurrency_with_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = () ->
                System.out.println("Task-1 , Thread#name : " + Thread.currentThread().getName());

        Runnable task2 = () ->
                System.out.println("Task-2 , Thread#name : " + Thread.currentThread().getName());

        Runnable task3 = () ->
                System.out.println("Task-3 , Thread#name : " + Thread.currentThread().getName());

        Runnable task4 = () ->
                System.out.println("Task-4 , Thread#name : " + Thread.currentThread().getName());

        Runnable task5 = () ->
                System.out.println("Task-5 , Thread#name : " + Thread.currentThread().getName());

        Runnable task6 = () ->
                System.out.println("Task-6 , Thread#name : " + Thread.currentThread().getName());

        Runnable task7 = () ->
                System.out.println("Task-7 , Thread#name : " + Thread.currentThread().getName());

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.execute(task6);
        executorService.execute(task7);

        executorService.shutdown();
    }
}

package chapter13.creating_threads_with_the_concurrency_api.increasing_concurrency_with_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NewFixedThreadPoolExample4 {

    public static void main(String[] args) {

        // https://www.tutorialspoint.com/java_concurrency/concurrency_newfixedthreadpool.htm

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Cast the object to its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        //Stats before tasks execution
        System.out.println("##### Stats before tasks execution #####");
        printThreadPoolExecutorDetails(pool);

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        //Stats after tasks execution
        System.out.println("##### Stats after tasks execution #####");
        printThreadPoolExecutorDetails(pool);

        executor.shutdown();
    }

    private static void printThreadPoolExecutorDetails(ThreadPoolExecutor pool) {
        System.out.println("Largest executions: "
                + pool.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "
                + pool.getMaximumPoolSize());
        System.out.println("Current threads in pool: "
                + pool.getPoolSize());
        System.out.println("Currently executing threads: "
                + pool.getActiveCount());
        System.out.println("Total number of tasks: "
                + pool.getTaskCount());
    }

    static class Task implements Runnable {

        public void run() {

            try {
                System.out.println("Running Task! Thread Name: " +
                        Thread.currentThread().getName());

                Thread.sleep(500);
                System.out.println("Task Completed! Thread Name: " +
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

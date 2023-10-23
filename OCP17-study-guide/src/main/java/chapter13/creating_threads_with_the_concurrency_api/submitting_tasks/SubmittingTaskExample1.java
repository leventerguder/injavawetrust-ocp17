package chapter13.creating_threads_with_the_concurrency_api.submitting_tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmittingTaskExample1 {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello-Message-Task");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            executorService.execute(task);
            executorService.submit(task);
            executorService.submit(new MyRunnable());
        } finally {
            executorService.shutdown();
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("MyRunnable#run invoked!");
        }
    }
}

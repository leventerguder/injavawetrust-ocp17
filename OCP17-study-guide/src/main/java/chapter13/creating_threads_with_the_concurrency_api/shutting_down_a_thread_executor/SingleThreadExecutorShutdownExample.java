package chapter13.creating_threads_with_the_concurrency_api.shutting_down_a_thread_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorShutdownExample {

    public static void main(String[] args) {


        Runnable printRecords = () -> {
            for (int i = 0; i < 1000; i++)
                System.out.println("Printing record: " + i);
        };


        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            service.execute(printRecords);
            System.out.println("end");
        } finally {
            service.shutdown();
            System.out.println("service.isShutdown() : " + service.isShutdown());
            System.out.println("service.isTerminated() : " + service.isTerminated());
        }

        service.execute(printRecords); // java.util.concurrent.RejectedExecutionException

    }
}

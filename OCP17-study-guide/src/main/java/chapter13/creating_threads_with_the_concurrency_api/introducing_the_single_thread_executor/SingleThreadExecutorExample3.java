package chapter13.creating_threads_with_the_concurrency_api.introducing_the_single_thread_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample3 {

    public static void main(String[] args) {


        Runnable printRecords = () -> {
            for (int i = 0; i < 1000; i++)
                System.out.println("Printing record: " + i);
        };


        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(printRecords); // Program hangs! Need shutdown!

    }
}

package chapter13.creating_threads_with_the_concurrency_api.increasing_concurrency_with_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolExample {

    public static void main(String[] args) throws InterruptedException {


        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable task = () -> System.out.println("Task1 , " + Thread.currentThread().getName());


        for (int i = 0; i < 1_000; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();

    }

//   Executors#newCachedThreadPool

//    public static ExecutorService newCachedThreadPool() {
//        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                60L, TimeUnit.SECONDS,
//                new SynchronousQueue<Runnable>());
//    }

//   Executors#newFixedThreadPool

//    public static ExecutorService newFixedThreadPool(int nThreads) {
//        return new ThreadPoolExecutor(nThreads, nThreads,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>());
//    }

}

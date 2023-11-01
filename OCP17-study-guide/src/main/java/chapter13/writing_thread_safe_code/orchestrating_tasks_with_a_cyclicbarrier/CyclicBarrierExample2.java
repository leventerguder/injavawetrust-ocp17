package chapter13.writing_thread_safe_code.orchestrating_tasks_with_a_cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierExample2 {

    //Runnable task for each thread
    private static class Task implements Runnable {

        private final CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread()
                        .getName() + " is waiting on barrier");
                barrier.await(1 , TimeUnit.SECONDS);
                System.out.println(Thread.currentThread()
                        .getName() + " has crossed the barrier");
            } catch (InterruptedException | BrokenBarrierException | TimeoutException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {

        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(4, () -> {
            System.out.println("All parties are arrived at barrier, lets play");
        });

        //starting each of thread
        Thread t1 = new Thread(new Task(cb), "[Thread-1]");
        Thread t2 = new Thread(new Task(cb), "[Thread-2]");
        Thread t3 = new Thread(new Task(cb), "[Thread-3]");
        Thread t4 = new Thread(new Task(cb), "[Thread-4]");

        t1.start();
        t2.start();
        t3.start();
        //t4.start(); // TimeoutException
    }
}
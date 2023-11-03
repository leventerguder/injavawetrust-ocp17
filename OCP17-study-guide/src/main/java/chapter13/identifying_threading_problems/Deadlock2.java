package chapter13.identifying_threading_problems;

public class Deadlock2 {

    public static Object LockA = new Object();
    public static Object LockB = new Object();

    private static class ThreadDemo1 extends Thread {

        public void run() {
            synchronized (LockA) {
                System.out.println("Holding Lock A. " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Waiting for Lock B. " + Thread.currentThread().getName());
                synchronized (LockB) {
                    System.out.println("Holding Lock B!. " + Thread.currentThread().getName());
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {

        public void run() {
            synchronized (LockB) {
                System.out.println("Holding Lock B. " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Waiting for Lock A. " + Thread.currentThread().getName());
                synchronized (LockA) {
                    System.out.println("Holding Lock A!. " + Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 thread1 = new ThreadDemo1();
        thread1.setName("my-thread-1");

        ThreadDemo2 thread2 = new ThreadDemo2();
        thread2.setName("my-thread-2");

        thread1.start();
        thread2.start();
    }
}

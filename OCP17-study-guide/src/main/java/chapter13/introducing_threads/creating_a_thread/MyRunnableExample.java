package chapter13.introducing_threads.creating_a_thread;

public class MyRunnableExample {

    public static void main(String[] args) {


        MyRunnable myRunnable1 = new MyRunnable("parameter-1");
        MyRunnable myRunnable2 = new MyRunnable("parameter-2");
        MyRunnable myRunnable3 = new MyRunnable("parameter-3");
        MyRunnable myRunnable4 = new MyRunnable("parameter-4");
        MyRunnable myRunnable5 = new MyRunnable("parameter-5");


        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);
        Thread thread4 = new Thread(myRunnable4);
        Thread thread5 = new Thread(myRunnable5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

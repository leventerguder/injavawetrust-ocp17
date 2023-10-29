package chapter13.writing_thread_safe_code.understanding_thread_safety;

public class IncrementAndDecrementTask implements Runnable {

    int counter = 0;

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        increment();
        decrement();
    }
}

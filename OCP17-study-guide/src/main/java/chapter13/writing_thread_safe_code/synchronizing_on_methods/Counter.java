package chapter13.writing_thread_safe_code.synchronizing_on_methods;

public class Counter {

    int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    public void execute() {
        increment();
        decrement();
    }
}

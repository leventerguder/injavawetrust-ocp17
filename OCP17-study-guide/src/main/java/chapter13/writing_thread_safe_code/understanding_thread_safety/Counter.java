package chapter13.writing_thread_safe_code.understanding_thread_safety;

public class Counter {

    int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
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

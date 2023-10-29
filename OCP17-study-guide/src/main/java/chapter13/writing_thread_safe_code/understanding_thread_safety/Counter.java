package chapter13.writing_thread_safe_code.understanding_thread_safety;

public class Counter {

    private long count = 0;

    public void add(long value) {
        this.count = this.count + value;
    }

    public long getCount() {
        return count;
    }
}

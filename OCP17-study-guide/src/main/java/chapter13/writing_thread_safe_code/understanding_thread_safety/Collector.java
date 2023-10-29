package chapter13.writing_thread_safe_code.understanding_thread_safety;

public class Collector {

    private long sum = 0;

    public void add(long value) {
        this.sum = this.sum + value;
    }

    public long getCount() {
        return sum;
    }
}

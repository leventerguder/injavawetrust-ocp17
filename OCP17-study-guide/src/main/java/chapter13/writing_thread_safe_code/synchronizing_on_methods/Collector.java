package chapter13.writing_thread_safe_code.synchronizing_on_methods;

public class Collector {

    private long sum = 0;

    public synchronized void add(long value) {
        this.sum = this.sum + value;
    }

    public long getCount() {
        return sum;
    }
}

package chapter13.writing_thread_safe_code.improving_access_with_synchronized_blocks;

public class Collector {

    private long sum = 0;

    public synchronized void add(long value) {
        this.sum = this.sum + value;
    }

    public long getCount() {
        return sum;
    }
}

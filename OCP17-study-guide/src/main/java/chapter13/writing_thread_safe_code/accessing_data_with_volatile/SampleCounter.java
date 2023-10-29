package chapter13.writing_thread_safe_code.accessing_data_with_volatile;

public class SampleCounter {

    volatile int counter = 0;

    public void increment() {
        counter++;
        System.out.println(counter);

        // https://jenkov.com/tutorials/java-concurrency/volatile.html
    }
}

package chapter13.writing_thread_safe_code.protecting_data_with_atomic_classes;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExample {

    public static void main(String[] args) {

        AtomicLong atomicLong = new AtomicLong(100);

        System.out.println("get : " + atomicLong.get());
        System.out.println("getAndIncrement : " + atomicLong.getAndIncrement()); // suffix
        System.out.println("incrementAndGet : " + atomicLong.incrementAndGet()); // prefix
        System.out.println("incrementAndGet : " + atomicLong.addAndGet(500));

        atomicLong.set(200);
        System.out.println("after set : " + atomicLong);

        long oldValue = atomicLong.getAndSet(300);
        System.out.println("getAndSet oldValue : " + oldValue);

        System.out.println("getAndDecrement : " + atomicLong.getAndDecrement());
        System.out.println("decrementAndGet : " + atomicLong.decrementAndGet());
    }
}

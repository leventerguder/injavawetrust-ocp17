package chapter13.writing_thread_safe_code.protecting_data_with_atomic_classes;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {

    public static void main(String[] args) {

        AtomicBoolean atomicBoolean = new AtomicBoolean();

        System.out.println("get : " + atomicBoolean.get());

        atomicBoolean.set(true);

        System.out.println("after set : " + atomicBoolean.get());
    }
}

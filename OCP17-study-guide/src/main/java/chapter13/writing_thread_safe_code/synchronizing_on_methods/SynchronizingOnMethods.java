package chapter13.writing_thread_safe_code.synchronizing_on_methods;

import chapter13.writing_thread_safe_code.understanding_thread_safety.SheepManager;

public class SynchronizingOnMethods {

    void singV1() {
        synchronized (this) {
            System.out.print("La la la!");
        }
    }

    synchronized void singV2() {
        System.out.print("La la la!");
    }

    static void danceV1() {
        synchronized (SheepManager.class) {
            System.out.print("Time to dance!");
        }
    }

    static synchronized void danceV2() {
        System.out.print("Time to dance!");
    }

    static void dance3() throws ClassNotFoundException {
        Class clazz = Class.forName("SheepManager");
        synchronized (clazz) {
            System.out.print("Time to dance!");
        }
    }
}

package chapter13.writing_thread_safe_code;

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
}

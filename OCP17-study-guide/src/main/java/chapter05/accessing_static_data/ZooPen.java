package chapter05.accessing_static_data;

public class ZooPen {
    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
        System.out.println(NUM_BUCKETS);

        // NUM_BUCKETS = 5; // DOES NOT COMPILE
        System.out.println(NUM_BUCKETS);
    }

}

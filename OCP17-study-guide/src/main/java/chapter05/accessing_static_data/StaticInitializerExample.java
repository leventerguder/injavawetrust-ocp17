package chapter05.accessing_static_data;

public class StaticInitializerExample {

    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        System.out.println(("Static Initializer - 1"));
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        System.out.println(("Static Initializer - 2"));
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }


    // All static initializers run when the class is first used, in the order they are defined.

    public static void main(String[] args) {
        System.out.println(("main - begin"));
        System.out.println("NUM_SECONDS_PER_MINUTE : " + NUM_SECONDS_PER_MINUTE);
        System.out.println("NUM_MINUTES_PER_HOUR : " + NUM_MINUTES_PER_HOUR);
        System.out.println("NUM_SECONDS_PER_HOUR : " + NUM_SECONDS_PER_HOUR);
        System.out.println(("main - end"));
    }
}

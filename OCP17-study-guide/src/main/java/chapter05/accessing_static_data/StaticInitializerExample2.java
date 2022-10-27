package chapter05.accessing_static_data;

public class StaticInitializerExample2 {

    private static int one;
    private static final int two;
    private static final int three = 3;
    // private static final int four; // DOES NOT COMPILE - never initialized

    static {
        one = 1;
        two = 2;
        //    three = 3; // DOES NOT COMPILE - final variable!
        //    two = 4; // DOES NOT COMPILE - final variable!
    }
}

package chapter05.accessing_static_data;

public class StaticInitializerExample2 {

    private static int one;
    private static final int two;
    private static final int three = 3;
    // private static final int four; // DOES NOT COMPILE - never initialized

    private int five;

    private static final int eight;

    static {
        one = 1;
        two = 2;
        //    three = 3; // DOES NOT COMPILE - final variable!
        //    two = 4; // DOES NOT COMPILE - final variable!

        // five = 5; // DOES NOT COMPILE - instance variable!

        int six = 6; // legal
        // static int seven = 7; // DOES NOT COMPILE - local variable

        eight = 8;
    }

    static {
        // eight = 8; // DOES NOT COMPILE
    }

}

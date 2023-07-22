package chapter05.working_with_varargs;

public class VisitAttractions {

    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3};
        walk1(data);

        // Pass a list of values
        walk1(1, 2, 3);

        // You can even omit the varargs values in the method call, and Java will create an array of length zero for you.
        walk1();

        // walk1(null); // NullPointerException
    }

    public static void walk1(int... steps) {

        int[] step2 = steps; // Not necessary, but shows steps is of type int[]
        System.out.println(step2.length);
    }

    public static void walk2(int start, int... steps) {
    }

//     public static void walk3(int... steps, int start) {} // DOES NOT COMPILE
//
//     public static void walk4(int... start, int... steps) {} // DOES NOT COMPILE
//
//     public static void walk5(int start, ...int steps) {} // DOES NOT COMPILE
}

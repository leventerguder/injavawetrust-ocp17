package chapter05;

public class Hike {

    public void hike1() {}
    public void hike2() { return; }
    public String hike3() { return ""; }

    //public String hike4() {}  // DOES NOT COMPILE
    //The hike4() method doesn’t compile because the return statement is missing.

    // public hike5() {} // DOES NOT COMPILE
    //The hike5() method doesn’t compile because the return type is missing.

    // public String int hike6() { } // DOES NOT COMPILE
    // The hike6() method doesn’t compile because it attempts to use two return types.

    // There is a return statement, but it doesn’t always get run.
    // Even though 1 is always less than 2, the compiler won’t fully evaluate the if statement and requires a return statement
    // if this condition is false.

    //    String hike7(int a) { // DOES NOT COMPILE
    //        if (1 < 2) return "orange";
    //    }

    // The code compiles, although the compiler will produce a warning about unreachable code (or dead code).
    // This means the compiler was smart enough to realize you wrote code that cannot possibly be reached.
    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple"; // COMPILER WARNING
    }

}

package chapter05;

public class Measurement {

    // When returning a value, it needs to be assignable to the return type.
    int getHeight1() {
        int temp = 9;
        return temp;
    }


//    int getHeight2() {
//        int temp = 9L; // DOES NOT COMPILE
//        return temp;
//    }

    // The getHeight2() method doesn’t compile because you can’t assign a long to an int.

//    int getHeight3() {
//        long temp = 9L;
//        return temp; // DOES NOT COMPILE
//    }

    // The method getHeight3() method doesn’t compile because you can’t return a long value as an int.

}

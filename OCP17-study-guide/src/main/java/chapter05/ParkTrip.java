package chapter05;

public class ParkTrip {

    public void skip1() {
    }

    // default void skip2() {} // DOES NOT COMPILE
    // The skip2() method doesn’t compile because default is not a valid access modifier

    // void public skip3() {} // DOES NOT COMPILE
    // The skip3() method doesn’t compile because the access modifier is specified after the return type.

    void skip4() {
    }
}
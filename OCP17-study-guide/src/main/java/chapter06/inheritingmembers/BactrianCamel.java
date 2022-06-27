package chapter06.inheritingmembers;

// In this example, BactrianCamel attempts to override the getNumberOfHumps() method defined in the parent class
// but fails because the access modifier private is more restrictive than the one defined in the parent version of the method.

public class BactrianCamel extends Camel {
//
//    private int getNumberOfHumps() { // DOES NOT COMPILE
//        return 2;
//    }
}
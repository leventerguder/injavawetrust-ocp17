package chapter07.implementing_interfaces;

public class Bunny implements Hop {
    public void printDetails() {
        // System.out.println(getJumpHeight()); // DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());

        // Without an explicit reference to the name of the interface,
        // the code will not compile, even though Bunny implements Hop.

        method();
    }
}
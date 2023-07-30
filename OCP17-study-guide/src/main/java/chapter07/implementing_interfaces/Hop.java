package chapter07.implementing_interfaces;

public interface Hop {

    // Since the method is defined without an access modifier,
    // the compiler will automatically insert the public access modifier.

    static int getJumpHeight() {
        return 8;
    }

    default void method() {
        System.out.println("hello default!");
    }
}

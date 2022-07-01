package chapter07.implementinginterfaces;

public interface Hop {

    // Since the method is defined without an access modifier,
    // the compiler will automatically insert the public access modifier.

    static int getJumpHeight() {
        return 8;
    }
}

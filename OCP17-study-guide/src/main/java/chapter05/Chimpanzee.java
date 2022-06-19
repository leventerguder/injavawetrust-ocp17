package chapter05;

public class Chimpanzee {

    public void climb(long t) {
    }

    public void swing(Integer u) {
    }

    public void jump(int v) {
    }

    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123); // Compiles because the int value can be implicitly cast to a long.
        c.swing(123); // the int value is autoboxed to an Integer.
        // c.jump(123L); // DOES NOT COMPILE
        // Compiler error because a long must be explicitly cast to an int. In other words, Java will not automatically convert to a narrower type.
    }
}

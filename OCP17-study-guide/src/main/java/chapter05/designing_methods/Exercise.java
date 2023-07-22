package chapter05.designing_methods;

public class Exercise {
    public void bike1() {
    }

    public final void bike2() {
    }

    public static final void bike3() {
    }

    public final static void bike4() {
    }

    // public modifier void bike5() {} // DOES NOT COMPILE
    // The bike5() method doesn’t compile because modifier is not a valid optional specifier.

    // public void final bike6() {} // DOES NOT COMPILE
    // The bike6() method doesn’t compile because the optional specifier is after the return type.

    public final void bike7() {
    }

    final public static void bike8() {
    }

    static final public void bike9() {
    }
}

package chapter05.overloading_methods;

public class Gorilla2 {

    public void rest(Long x) {
        System.out.print("long");
    }

    public static void main(String[] args) {
        var g = new Gorilla2();
        // g.rest(8); // DOES NOT COMPILE
    }
    // Java will cast or autobox the value automatically, but not both at the same time.
}

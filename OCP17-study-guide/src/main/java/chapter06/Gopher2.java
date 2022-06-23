package chapter06;

public class Gopher2 {

    // The constructors call each other, and the process continues infinitely. Since the compiler can detect this, it reports
    //an error.
    public Gopher2() {
        // this(5); // DOES NOT COMPILE
    }

    public Gopher2(int dugHoles) {
        //this(); // DOES NOT COMPILE
    }
}

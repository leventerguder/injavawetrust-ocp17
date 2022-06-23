package chapter06;


public class Gopher {
    //The compiler is capable of detecting that this constructor is calling itself infinitely.
    public Gopher(int dugHoles) {
        // this(5); // DOES NOT COMPILE
    }
}

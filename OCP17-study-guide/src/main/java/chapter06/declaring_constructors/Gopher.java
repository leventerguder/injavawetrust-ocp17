package chapter06.declaring_constructors;


public class Gopher {
    //The compiler is capable of detecting that this constructor is calling itself infinitely.
    public Gopher(int dugHoles) {
        // this(5); // DOES NOT COMPILE
    }
}

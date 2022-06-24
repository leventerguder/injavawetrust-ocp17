package chapter06;

// public class Seal extends Mammal {} // DOES NOT COMPILE


public class Seal extends Mammal {
    public Seal() {
        super(6); // Explicit call to parent constructor
    }
}

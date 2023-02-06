package chapter06.declaring_constructors;

// public class Seal extends Mammal {} // DOES NOT COMPILE


public class Seal extends Mammal {
    public Seal() {
        super(6); // Explicit call to parent constructor
    }
}

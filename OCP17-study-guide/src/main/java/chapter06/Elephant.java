package chapter06;

public class Elephant extends Mammal {
    //  public Elephant() {} // DOES NOT COMPILE

    public Elephant() {
        super(4); // Explicit call to parent constructor
    }
}

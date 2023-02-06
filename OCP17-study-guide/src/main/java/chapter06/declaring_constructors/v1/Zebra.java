package chapter06.declaring_constructors.v1;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}
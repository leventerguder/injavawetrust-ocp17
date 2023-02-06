package chapter06.declaring_constructors.v1;

public class Animal {
    private int age;
    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}
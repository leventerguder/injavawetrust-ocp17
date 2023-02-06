package chapter06.declaring_constructors.v2;

public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla"); // Calls the first Animal constructor
    }

    public Gorilla() {
        super(5); // Calls the second Animal constructor
    }

}

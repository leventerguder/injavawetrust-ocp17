package chapter06.declaring_constructors;

public class Hamster3 {
    private String color;
    private int weight;

    public Hamster3(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster3(int weight) { // Second constructor
        new Hamster3(weight, "brown"); // Compiles, but creates an extra object
    }
}
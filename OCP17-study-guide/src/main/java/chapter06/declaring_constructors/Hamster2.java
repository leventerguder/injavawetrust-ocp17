package chapter06.declaring_constructors;

public class Hamster2 {
    private String color;
    private int weight;

    public Hamster2(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster2(int weight) { // Second constructor
        // Hamster2(weight, "brown"); // DOES NOT COMPILE
    }
}
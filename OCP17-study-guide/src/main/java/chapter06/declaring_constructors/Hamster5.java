package chapter06.declaring_constructors;

public class Hamster5 {
    private String color;
    private int weight;

    public Hamster5(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster5(int weight) { // Second constructor
        // System.out.println("chew"); // DOES NOT COMPILE
        this(weight, "brown");
    }
}
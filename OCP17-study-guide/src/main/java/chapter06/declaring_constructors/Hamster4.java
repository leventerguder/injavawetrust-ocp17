package chapter06.declaring_constructors;

public class Hamster4 {
    private String color;
    private int weight;

    public Hamster4(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster4(int weight) { // Second constructor
        this(weight, "brown");
    }
}
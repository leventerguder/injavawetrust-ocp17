package chapter06.declaring_constructors;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) { // Second constructor
        this.weight = weight;
        color = "brown";
    }
}
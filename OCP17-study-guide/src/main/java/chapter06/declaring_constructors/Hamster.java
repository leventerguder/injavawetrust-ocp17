package chapter06.declaring_constructors;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) { // Second constructor
//        this.weight = weight;
//        color = "brown";

//        Hamster(weight, "brown"); // DOES NOT COMPILE

        /*
        Calling this() has one special rule you need to know. If you choose to call it, the this() call must be the first statement in the constructor.
        The side effect of this is that there can be only one call to this() in any constructor.
         */
        // System.out.println("chew"); // WOULD CAUSE COMPILE ERROR
        this(weight, "brown");
    }
}
package chapter06.initializingobjects;

public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House"; // Declaration assignment

    {
        volume = 10; // Instance initializer assignment
    }
}
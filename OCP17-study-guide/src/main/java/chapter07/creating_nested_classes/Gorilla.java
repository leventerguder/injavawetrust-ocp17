package chapter07.creating_nested_classes;


public class Gorilla {
    interface Climb {
    }

    Climb climbing = new Climb() {
    };
}
package chapter07.creatingnestedclasses;


public class Gorilla {
    interface Climb {
    }

    Climb climbing = new Climb() {
    };
}
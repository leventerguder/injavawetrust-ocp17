package chapter05.applying_access_modifiers.pond.duck;

public class MotherDuck {

    String noise = "quack";

    void quack() {
        System.out.print(noise);// package access is ok
    }
}

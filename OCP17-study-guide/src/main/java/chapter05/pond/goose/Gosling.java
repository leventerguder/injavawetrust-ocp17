package chapter05.pond.goose;

import chapter05.pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floatInWater(); // protected access is ok
        System.out.println(text); // protected access is ok
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}

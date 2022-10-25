package chapter05.applying_access_modifiers.pond.goose; //Different package than Bird

import chapter05.applying_access_modifiers.pond.shore.Bird;

public class Gosling extends Bird { // Gosling is a subclass of Bird

    public void swim() {
        floatInWater(); // protected access is ok
        System.out.println(text); // protected access is ok
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}

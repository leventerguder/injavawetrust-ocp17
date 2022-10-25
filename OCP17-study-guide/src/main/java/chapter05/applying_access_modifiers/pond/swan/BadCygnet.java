package chapter05.applying_access_modifiers.pond.swan;

import chapter05.applying_access_modifiers.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {

        var duck = new MotherDuck();
        // duck.quack();   // DOES NOT COMPILE
        // System.out.print(duck.noise); // DOES NOT COMPILE
    }
}

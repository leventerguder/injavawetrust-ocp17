package chapter05.pond.swan;

import chapter05.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {

        var duck = new MotherDuck();
        // duck.quack();   // DOES NOT COMPILE
        // System.out.print(duck.noise); // DOES NOT COMPILE
    }
}

package chapter05.applying_access_modifiers.pond.duck;

public class FatherDuck {

    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is ok
    }
}


class BadDuckling2 {
    public void makeNoise() {
        var duck = new FatherDuck();
        // duck.quack();   // DOES NOT COMPILE
        // System.out.print(duck.noise); // DOES NOT COMPILE
    }
}

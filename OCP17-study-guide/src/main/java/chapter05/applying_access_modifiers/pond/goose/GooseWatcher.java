package chapter05.applying_access_modifiers.pond.goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        // goose.floatInWater(); // DOES NOT COMPILE
        // This code doesn’t compile because we are not in the goose object.
    }
}

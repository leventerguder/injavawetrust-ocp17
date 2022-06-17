package chapter05.pond.goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        // goose.floatInWater(); // DOES NOT COMPILE
        // This code doesn’t compile because we are not in the goose object.
    }
}

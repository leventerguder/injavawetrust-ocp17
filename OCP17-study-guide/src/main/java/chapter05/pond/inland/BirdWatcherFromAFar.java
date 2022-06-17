package chapter05.pond.inland;

import chapter05.pond.shore.Bird;

public class BirdWatcherFromAFar { // Not a subclass of Bird

    public void watchBird() {
        Bird bird = new Bird();
        // bird.floatInWater(); // DOES NOT COMPILE
        // System.out.print(bird.text); // DOES NOT COMPILE
    }

}

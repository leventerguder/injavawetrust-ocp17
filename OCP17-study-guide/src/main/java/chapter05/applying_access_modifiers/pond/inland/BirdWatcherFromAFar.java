package chapter05.applying_access_modifiers.pond.inland; // Different package than Bird

import chapter05.applying_access_modifiers.pond.shore.Bird;

public class BirdWatcherFromAFar { // Not a subclass of Bird

    public void watchBird() {
        Bird bird = new Bird();
        // bird.floatInWater(); // DOES NOT COMPILE
        // System.out.print(bird.text); // DOES NOT COMPILE
    }

}

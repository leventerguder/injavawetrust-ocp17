package chapter05.pond.shore;

public class BirdWatcher {

    // Remember that protected also gives us access to everything that package access does.
    // This means a class in the same package as Bird can access its protected members.

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.print(bird.text); // protected access is ok
    }
}

package chapter13.using_common_annotations.example01;

public class Dog extends Canine {

    // @Override // DOES NOT COMPILE
    public boolean playFetch() {
        return true;
    }

    // @Override // DOES NOT COMPILE
    void howl(int timeOfDay) {
    }
}

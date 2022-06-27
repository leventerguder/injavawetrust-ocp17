package chapter06.inheritingmembers;

public class Shark extends Fish {
    @Override
    public void swim() {
    }

    // @Override // DOES NOT COMPILE
    public void swim(int speed) {
    }

}

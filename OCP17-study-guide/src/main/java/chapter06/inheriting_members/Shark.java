package chapter06.inheriting_members;

public class Shark extends Fish {
    @Override
    public void swim() {
    }

    // @Override // DOES NOT COMPILE
    public void swim(int speed) {
    }

}

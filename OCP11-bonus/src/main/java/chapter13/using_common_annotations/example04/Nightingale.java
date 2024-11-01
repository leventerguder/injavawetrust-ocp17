package chapter13.using_common_annotations.example04;

import java.util.ArrayList;

public class Nightingale {
    public void wakeUp() {
        SongBird.sing(10);
    }
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    void fly() {
        SongBird.flyWithWings();
    }

    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();
        birdy.fly();
    }
}
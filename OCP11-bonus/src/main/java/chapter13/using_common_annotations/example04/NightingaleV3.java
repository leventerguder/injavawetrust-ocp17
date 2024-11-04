package chapter13.using_common_annotations.example04;

import java.util.ArrayList;

@SuppressWarnings({"deprecation", "unchecked", "removal"})
public class NightingaleV3 {
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
        var birdy = new NightingaleV3();
        birdy.wakeUp();
        birdy.goToBed();
        birdy.fly();
    }
}
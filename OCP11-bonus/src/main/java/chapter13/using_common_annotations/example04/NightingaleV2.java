package chapter13.using_common_annotations.example04;

import java.util.ArrayList;

public class NightingaleV2 {
    @SuppressWarnings("deprecation")
    public void wakeUp() {
        SongBird.sing(10);
    }

    @SuppressWarnings("unchecked")
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    @SuppressWarnings("removal")
    void fly (){
       SongBird.flyWithWings();
    }

    public static void main(String[] args) {
        var birdy = new NightingaleV2();
        birdy.wakeUp();
        birdy.goToBed();
        birdy.fly();
    }
}
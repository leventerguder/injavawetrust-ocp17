package chapter09.workingwithgenerics;

import java.util.ArrayList;
import java.util.List;


public class CreatingUpperBounderWildcardsExample3 {


    public static void main(String[] args) {

        List<HangGlider> hangGliders = new ArrayList<>();
        List<Goose> gooses = new ArrayList<>();

        // anyFlyer(hangGliders); // DOES NOT COMPILE
        // anyFlyer(gooses); // DOES NOT COMPILE

        groupOfFlyers(hangGliders);
        groupOfFlyers(gooses);
    }


    private static void anyFlyer(List<Flyer> flyer) {
    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) {
    }
}


interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
    }
}

class Goose implements Flyer {
    public void fly() {
    }
}


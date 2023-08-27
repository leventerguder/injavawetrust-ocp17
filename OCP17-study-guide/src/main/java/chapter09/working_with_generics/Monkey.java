package chapter09.working_with_generics;

import java.util.ArrayList;

public class Monkey extends Mammal {

    // !! Covariant return type!
    @Override
    public ArrayList<CharSequence> play() {
        return new ArrayList<>();
    }
}
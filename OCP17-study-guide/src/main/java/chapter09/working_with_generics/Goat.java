package chapter09.working_with_generics;

import java.util.List;

public class Goat extends Mammal {

//    public List<String> play() {
//        return List.of();
//    } // DOES NOT COMPILE

    @Override
    public List<CharSequence> play() {
        return List.of();
    }

    // Covariant return type
    @Override
    public String sleep() {
        return "goat";
    }

    @Override
    public String[] playArray() {
        return List.of().toArray(new String[0]);
    }

}

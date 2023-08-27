package chapter09.working_with_generics;

import java.util.List;

public class Mammal {

    public List<CharSequence> play() {
        return List.of();
    }

    public CharSequence[] playArray() {
        return List.of().toArray(new CharSequence[0]);
    }

    public CharSequence sleep() {
        return "string";
    }
}

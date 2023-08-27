package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class Anteater extends LongTailAnimal {
    // protected void chew(List<Double> input) {} // DOES NOT COMPILE

    @Override
    protected void chew(List<Object> input) {}

    // Overloaded!
    protected void chew(ArrayList<Double> input) {}
}
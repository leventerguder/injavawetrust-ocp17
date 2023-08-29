package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUpperBounderWildcardsExample5 {

    public static void main(String[] args) {

        List<?> unbounded = new ArrayList<>();
        ArrayList<?> unbounded2 = new ArrayList<>();


        List<? extends Object> upperBounded = new ArrayList<>();
        ArrayList<? extends Object> upperBounded2 = new ArrayList<>();
        // Wildcard type argument '?' explicitly extends 'java.lang.Object'

        List<Object> objects = new ArrayList<>();

        unbounded = upperBounded;

        // objects = upperBounded; // DOES NOT COMPILE
        // objects = unbounded; // DOES NOT COMPILE

        upperBounded2 = unbounded2;
    }
}

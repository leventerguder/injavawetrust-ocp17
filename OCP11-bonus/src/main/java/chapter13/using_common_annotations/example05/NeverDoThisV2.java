package chapter13.using_common_annotations.example05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeverDoThisV2 {

    @SafeVarargs

    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); // ClassCastException at runtime
    }

    public static void main(String[] args) {

        var carrot = new ArrayList<Integer>();
        new NeverDoThisV2().thisIsUnsafe(carrot);
    }

}

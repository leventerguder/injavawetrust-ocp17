package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingLowerBoundedWildcardsExample1 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);

        List<Integer> integers = new ArrayList<>();

        List<CharSequence> charSequences = new ArrayList<>();

        List<StringBuilder> sbs = new ArrayList<>();

        addSound(strings);
        addSound(objects);
        // addSound(integers); // DOES NOT COMPILE
        addSound(charSequences);

        // addSound(sbs); // DOES NOT COMPILE
    }

    public static void addSound(List<? super String> list) {
        list.add("quack");
    }
}

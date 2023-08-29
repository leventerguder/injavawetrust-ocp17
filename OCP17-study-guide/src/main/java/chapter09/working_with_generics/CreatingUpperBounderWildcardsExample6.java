package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUpperBounderWildcardsExample6 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("element");

        remove(list);

        System.out.println(list);
    }

    public static void remove(List<? extends CharSequence> elements) {
        elements.remove("element");
        elements.add(null);
        elements.add(null);
    }
}

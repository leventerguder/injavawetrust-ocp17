package chapter09.using_the_list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparingListImplementations {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("lions");
        animals.add("pandas");
        animals.add("zebras");

        List<String> animalsV2 = new LinkedList<>();
        animalsV2.add("lions");
        animalsV2.add("pandas");
        animalsV2.add("zebras");

    }
}

package chapter09.using_the_list_interface;

import java.util.ArrayList;
import java.util.List;

public class UsingTheListInterface {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("lions");
        animals.add("pandas");
        animals.add("zebras");

        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.get(2));
    }
}

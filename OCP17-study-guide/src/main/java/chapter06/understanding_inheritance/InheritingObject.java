package chapter06.understanding_inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritingObject {

    public static void main(String[] args) {

        String s = "str";
        Integer i = 10;
        Zoo z = new Zoo();
        int[] array = new int[5];
        List<String> list = new ArrayList<>();

        System.out.println(s instanceof Object);
        System.out.println(i instanceof Object);
        System.out.println(z instanceof Object);
        System.out.println(array instanceof Object);
        System.out.println(list instanceof Object);
    }
}

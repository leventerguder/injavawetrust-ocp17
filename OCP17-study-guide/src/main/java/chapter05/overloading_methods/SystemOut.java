package chapter05.overloading_methods;

import java.util.List;

public class SystemOut {

    public static void main(String[] args) {

        int number = 100;
        Integer wrapper = 100;
        String str = "content";
        boolean result = true;
        List<Integer> list = List.of(1, 2, 3);

        System.out.println(number);
        System.out.println(wrapper);
        System.out.println(str);
        System.out.println(result);
        System.out.println(list);
    }
}

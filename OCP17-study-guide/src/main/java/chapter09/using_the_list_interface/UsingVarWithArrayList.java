package chapter09.using_the_list_interface;

import java.sql.Array;
import java.util.ArrayList;

public class UsingVarWithArrayList {

    public static void main(String[] args) {

        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s : strings) {
            System.out.println(s);
        }

        var list = new ArrayList<>();
        list.add("a");
        list.add(10);
        list.add('b');
        list.add(true);

        // for (String s : list) {} // DOES NOT COMPILE

        // The type of the var is ArrayList<Object>

        for (Object s : list) {
            System.out.println(s);
        }

        var list2 = new ArrayList();
        list2.add("a");
        list2.add(10);
        list2.add('b');
        list2.add(true);

        for (Object s : list2) {
            System.out.println(s);
        }

    }
}

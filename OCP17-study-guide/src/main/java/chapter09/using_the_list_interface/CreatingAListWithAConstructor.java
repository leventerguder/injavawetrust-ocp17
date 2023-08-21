package chapter09.using_the_list_interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreatingAListWithAConstructor {

    public static void main(String[] args) {

        var linked1 = new LinkedList<String>();
        linked1.add("element1");
        linked1.add("element2");
        var linked2 = new LinkedList<String>(linked1);

        System.out.println(linked1);
        System.out.println(linked2);

        var list1 = new ArrayList<String>();
        list1.add("value1");
        list1.add("value2");
        list1.add("value3");
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());
    }
}

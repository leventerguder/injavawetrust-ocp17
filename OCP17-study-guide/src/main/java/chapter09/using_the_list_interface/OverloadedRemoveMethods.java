package chapter09.using_the_list_interface;

import java.util.LinkedList;

public class OverloadedRemoveMethods {

    public static void main(String[] args) {

        var list = new LinkedList<Integer>();
        list.add(3);    // [3]
        list.add(2);    // [3,2]
        list.add(1);    // [3,2,1]
        System.out.println(list);
        list.remove(2); // [3,2]
        System.out.println(list);
        list.remove(Integer.valueOf(2)); //[3]
        // list.remove(2);
        System.out.println(list);
    }
}

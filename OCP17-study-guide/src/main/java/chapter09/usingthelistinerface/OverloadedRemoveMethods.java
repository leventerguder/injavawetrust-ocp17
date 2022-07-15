package chapter09.usingthelistinerface;

import java.util.LinkedList;

public class OverloadedRemoveMethods {

    public static void main(String[] args) {

        var list = new LinkedList<Integer>();
        list.add(3);    // [3]
        list.add(2);    // [3,2]
        list.add(1);    // [3,2,1]
        list.remove(2); // [3,2]
        list.remove(Integer.valueOf(2)); //[3]
        System.out.println(list);
    }
}

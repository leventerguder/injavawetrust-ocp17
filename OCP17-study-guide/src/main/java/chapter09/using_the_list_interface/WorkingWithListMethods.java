package chapter09.using_the_list_interface;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListMethods {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("SD");                             // [SD]
        list.add(0, "NY");            // [NY,SD]
        list.set(1, "FL");                          // [NY,FL]
        System.out.println(list.get(0));            // NY
        list.remove("NY");                       // [FL]
        list.remove(0);                       // []
        list.set(0, "?");                           // IndexOutOfBoundsException
    }
}

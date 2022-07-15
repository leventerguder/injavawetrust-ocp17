package chapter09.usingthelistinerface;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreatingAListWithAConstructor {

    public static void main(String[] args) {

        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

    }
}

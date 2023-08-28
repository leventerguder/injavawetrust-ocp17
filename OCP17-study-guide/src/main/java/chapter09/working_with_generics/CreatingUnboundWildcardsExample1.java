package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample1 {

    public static void printList(List<Object> list) {
        for (Object x : list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //printList(keywords); // DOES NOT COMPILE
        // A String is a subclass of an Object. This is true. However, List<String> cannot be assigned to List<Object>.

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("java");
        objects.add("17");

        printList(objects);

    }

}

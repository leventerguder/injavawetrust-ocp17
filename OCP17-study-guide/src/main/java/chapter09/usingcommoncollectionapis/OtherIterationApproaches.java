package chapter09.usingcommoncollectionapis;

import java.util.Iterator;
import java.util.List;

public class OtherIterationApproaches {

    public static void main(String[] args) {

        List<String> coll = List.of("value1", "value2", "value3");

        for (String element : coll)
            System.out.println(element);

        System.out.println();

        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        }
    }
}

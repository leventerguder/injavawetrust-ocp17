package chapter09.using_common_collection_apis;

import java.util.Iterator;
import java.util.List;

public class OtherIterationApproaches {

    public static void main(String[] args) {

        List<String> coll = List.of("value1", "value2", "value3");

        System.out.println("Enhanced For Loop");
        for (String element : coll)
            System.out.println(element);


        System.out.println("Iterator");
        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        }

        System.out.println("Index based");
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(coll.get(i));
        }
    }
}

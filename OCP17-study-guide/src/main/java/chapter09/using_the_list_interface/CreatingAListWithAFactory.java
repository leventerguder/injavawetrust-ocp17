package chapter09.using_the_list_interface;

import java.util.Arrays;
import java.util.List;

public class CreatingAListWithAFactory {

    public static void main(String[] args) {

        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        array[0] = "z";

        System.out.println(asList);     // [z, b, c]
        System.out.println(of);         // [a, b, c]
        System.out.println(copy);       // [a, b, c]

        System.out.println(asList.getClass());
        System.out.println(of.getClass());
        System.out.println(copy.getClass());

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));  // [x, b, c]

        asList.add("y");  // UnsupportedOperationException
        // of.add("y");   // UnsupportedOperationException
        // copy.add("y"); // UnsupportedOperationException

    }
}

package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample5 {

    public static void main(String[] args) {

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();
        // ArrayList<Object> x2 = new ArrayList<>();

        // First, x1 is of type List, while x2 is of type ArrayList. Additionally, we can only assign x2 to a List<Object>.

        x1 = x2;

       // List<Object> x3 = x1; // DOES NOT COMPILE

        List<Object> x4 = x2;
        ArrayList<Object> x5 = x2;

       // List<String> x6 = x2; // DOES NOT COMPILE

        // method(x1);
        method(x2);
        method(x4);
        method(x5);
        // method(x6);

    }

    public static void method(List<Object> objectType) {
        System.out.println(objectType);
    }

}

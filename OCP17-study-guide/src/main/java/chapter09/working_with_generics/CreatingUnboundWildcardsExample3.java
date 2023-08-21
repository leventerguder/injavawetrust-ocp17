package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample3 {

    public static void main(String[] args) {

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();

        // First, x1 is of type List, while x2 is of type ArrayList. Additionally, we can only assign x2 to a List<Object>.
    }

}

package chapter09.workingwithgenerics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUpperBounderWildcardsExample1 {

    public static void main(String[] args) {

        //ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE

        // Instead, we need to use a wildcard:
        List<? extends Number> list = new ArrayList<Integer>();
    }
}

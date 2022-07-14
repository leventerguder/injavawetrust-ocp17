package chapter09.usingcommoncollectionapis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsingTheDiamondOperator {

    private void longFormat() {
        List<Integer> list = new ArrayList<Integer>();
        Map<Long, List<Integer>> mapLists = new HashMap<Long, List<Integer>>();
    }

    private void shortFormat() {
        List<Integer> list = new ArrayList<>();
        Map<Long, List<Integer>> mapLists = new HashMap<>();
    }

    private void invalid() {
        // The diamond operator cannot be used as the type in a variable declaration.
        // List<> list = new ArrayList<Integer>(); // DOES NOT COMPILE
    }


    class InvalidUse {
        // The diamond operator cannot be used as the type in a variable declaration.
        // void use(List<> data) {} // DOES NOT COMPILE
    }
}

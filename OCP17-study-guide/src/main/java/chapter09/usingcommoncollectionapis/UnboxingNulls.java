package chapter09.usingcommoncollectionapis;

import java.util.ArrayList;

public class UnboxingNulls {

    public static void main(String[] args) {

        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }
}

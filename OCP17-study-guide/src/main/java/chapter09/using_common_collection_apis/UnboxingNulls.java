package chapter09.using_common_collection_apis;

import java.util.ArrayList;

public class UnboxingNulls {

    public static void main(String[] args) {

        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }
}

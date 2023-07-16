package chapter04.understanding_arrays;

import java.util.Arrays;

public class Names {
    String names[]; //The code never instantiated the array, so it is just a reference variable to null.


    // It has two elements because the length is 2.
    // Each of those two slots currently is null but has the potential to point to a String object
    String names2[] = new String[2];

    public static void main(String[] args) {

        Names obj = new Names();
        System.out.println(obj.names);
        System.out.println(obj.names2);
        System.out.println(Arrays.toString(obj.names2));
    }
}

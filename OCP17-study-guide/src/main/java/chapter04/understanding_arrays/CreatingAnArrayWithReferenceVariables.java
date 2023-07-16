package chapter04.understanding_arrays;

import java.util.Arrays;

public class CreatingAnArrayWithReferenceVariables {

    public static void main(String[] args) {

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@4617c264
        System.out.println(Arrays.toString(bugs));

        String[] names = new String[4];
        for (String name : names) {
            System.out.println(name);
        }

        /*
        We can call equals() because an array is an object. It returns true because of reference equality.
        The equals() method on arrays does not look at the elements of the array.
         */

        int[] numbers = {1, 5, 20, 3, 4};
        System.out.println(numbers); // [I@36baf30c
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 5, 20, 3, 4};
        System.out.println(numbers.equals(numbers2)); //false
        System.out.println(Arrays.equals(numbers, numbers2)); // true
    }
}

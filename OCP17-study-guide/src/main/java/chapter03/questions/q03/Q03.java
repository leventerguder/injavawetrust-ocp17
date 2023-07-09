package chapter03.questions.q03;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Q03 {

//    Which of the following data types are permitted on the right side of a for-each expression? (Choose all that apply.)
//++    A. Double[][]
//    B. Object
//    C. Map
//++    D. List
//    E. String
//++    F. char[]
//    G. Exception
//++    H. Set

    public static void main(String[] args) {

        Double[][] doubleArray = {{1.2d, 5.0}, {6.0d, 3.2d}};
        for (Double[] d : doubleArray) {
            System.out.println(Arrays.toString(d));
        }

        List<Integer> numbers = List.of(1, 5, 20, 3);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();


        char[] chars = "content".toCharArray();

        for (char c : chars) {
            System.out.print(c + "-");
        }
        System.out.println();

        Set<String> roles = Set.of("user", "admin", "client");

        for (String role : roles) {
            System.out.print(role + "|");
        }
    }
}

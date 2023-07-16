package chapter04.understanding_arrays;

public class CreatingAMultidimensionalArray {

    public static void main(String[] strings) {

        int[][] vars1;  // 2D array
        int vars2[][];  // 2D array
        int[] vars3[];  // 2D array
        int[] vars4[], space[][]; // 2D array and 3D array

        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};


        int[][] args = new int[5][];

        args[0] = new int[5];
        args[1] = new int[3];
        args[2] = new int[10];
        args[3] = new int[2];

        int[] intArray = new int[3];
        int[][] intMultiArray = new int[5][];
        // intMultiArray =intArray; // DOES NOT COMPILE
        intMultiArray[0] = intArray;

    }
}

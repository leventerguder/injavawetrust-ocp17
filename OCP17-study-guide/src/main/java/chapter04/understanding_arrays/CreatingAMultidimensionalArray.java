package chapter04.understanding_arrays;

public class CreatingAMultidimensionalArray {

    public static void main(String[]... strings) {

        int[][] vars1;  // 2D array
        int vars2[][];  // 2D array
        int[] vars3[];  // 2D array
        int[] vars4[], space[][]; // 2D array and 3D array

        String[][] rectangle = new String[3][2];

        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};


        int[][] args = new int[4][];
        args[0] = new int[5];
        args[1] = new int[3];
    }
}

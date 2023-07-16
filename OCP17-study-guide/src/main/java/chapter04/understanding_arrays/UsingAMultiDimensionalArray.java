package chapter04.understanding_arrays;

public class UsingAMultiDimensionalArray {

    public static void main(String[] args) {
        var twoD = new int[3][2];
        twoD[0][0] = 1;
        twoD[0][1] = 2;
        twoD[1][0] = 3;
        twoD[1][1] = 4;
        twoD[2][0] = 5;
        twoD[2][1] = 6;

        print2DArray(twoD);
        print2DArrayV2(twoD);

        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};

        print2DArray(differentSizes);
        print2DArrayV2(differentSizes);
    }

    private static void print2DArrayV2(int[][] twoD) {
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

        System.out.println();
    }

    private static void print2DArray(int[][] twoD) {
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

        System.out.println();
    }

}

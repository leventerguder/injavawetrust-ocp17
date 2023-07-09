package chapter03.controlling_flow_with_branching;

public class NestedLoops2 {

    public static void main(String[] args) {

        printMatrix();
        System.out.println();
        printMatrix2();

    }

    private static void printMatrix() {
        int[][] matrix = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printMatrix2() {

        int[][] matrix = {{5, 2, 1, 3, 10}, {3, 9, 8, 9}, {5, 7, 7}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

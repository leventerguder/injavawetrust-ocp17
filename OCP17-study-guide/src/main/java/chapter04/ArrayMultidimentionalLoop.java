package chapter04;

public class ArrayMultidimentionalLoop {

    public static void main(String[] args) {
        var twoD = new int[3][2];
        twoD[0][0] = 1;
        twoD[0][1] = 2;
        twoD[1][0] = 3;
        twoD[1][1] = 4;
        twoD[2][0] = 5;
        twoD[2][1] = 6;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

        System.out.println();

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}

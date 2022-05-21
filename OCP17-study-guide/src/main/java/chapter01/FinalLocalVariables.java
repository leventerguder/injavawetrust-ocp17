package chapter01;

public class FinalLocalVariables {

    public static void main(String[] args) {

        final int y = 10;
        int x = 20;
        // y = x + 10; // DOES NOT COMPILE


        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        // favoriteNumbers = null; // DOES NOT COMPILE

    }
}

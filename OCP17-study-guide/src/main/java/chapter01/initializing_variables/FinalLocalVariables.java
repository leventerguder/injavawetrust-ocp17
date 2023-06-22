package chapter01.initializing_variables;

import java.util.ArrayList;
import java.util.List;

public class FinalLocalVariables {

    public static void main(String[] args) {

        final int y = 10;
        int x = 20;
        // y = x + 10; // DOES NOT COMPILE


        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        // favoriteNumbers = null; // DOES NOT COMPILE


        final int[] favoriteNumbers2 = new int[]{10, 20};
        favoriteNumbers2[0] = 30;
        favoriteNumbers2[1] = 40;

        final int[] favoriteNumbers3 = {10, 20};
        favoriteNumbers3[0] = 30;
        favoriteNumbers3[1] = 40;


        final List<Integer> counters = new ArrayList<>();
        counters.add(10);
        counters.add(20);
    }
}

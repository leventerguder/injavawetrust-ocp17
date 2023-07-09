package chapter03.controlling_flow_with_branching;

public class BreakStatement4 {

    public static void main(String[] args) {

        OUTER:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
                if (i == 2) {
                    break OUTER;
                }
            }

            System.out.println();
        }
    }
}

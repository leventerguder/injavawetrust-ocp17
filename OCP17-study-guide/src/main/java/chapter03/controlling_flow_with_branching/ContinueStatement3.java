package chapter03.controlling_flow_with_branching;

public class ContinueStatement3 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.println(i + "," + j);
            }

            System.out.println("line1");
            System.out.println("line2");

            System.out.println();
        }
    }
}

package chapter03.controlling_flow_with_branching;

public class ContinueStatement2 {

    public static void main(String[] args) {

        LABEL:
        for (int i = 0; i < 20; i++) {

            if (i % 2 == 0) {
                continue LABEL;
            }

            System.out.println(i);
        }
    }
}

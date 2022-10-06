package chapter03.writing_while_loops;

public class WhileStatement3 {

    public static void main(String[] args) {

        // how many times is Not full! printed in the following example?
        // The answer? Zero! On the first iteration of the loop, the condition is reached, and the loop exits.

        int full = 5;
        while (full < 5) {
            System.out.println("Not full!");
            full++;
        }
    }
}

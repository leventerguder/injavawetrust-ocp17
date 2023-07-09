package chapter03.writing_while_loops;

public class WhileStatement4 {

    public static void main(String[] args) {

        int x = 1;
//        while (x) {
//        } //DOES NOT COMPILE
//        while (x = 5) {
//        } //DOES NOT COMPILE


        while (x == 5) {
        }
        ; // REDUNDANT

        while (true) {
        }

        // System.out.println("Unreachable code"); // DOES NOT COMPILE
    }
}

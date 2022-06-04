package chapter03;

public class ForUsingLoopVariablesOutsideTheLoop {

    public static void main(String[] args) {

        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++)
            System.out.print(y + " ");
        // System.out.print(x); // DOES NOT COMPILE
    }
}

package chapter03.writing_while_loops;

public class InfiniteLoop2 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("infinite loop begins...");
            ///
            ///
            //
            System.out.println("before break statement.");
            break;
        }

        System.out.println("after while loop.");
    }
}

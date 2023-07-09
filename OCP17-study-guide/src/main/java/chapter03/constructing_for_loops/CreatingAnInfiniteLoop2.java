package chapter03.constructing_for_loops;

public class CreatingAnInfiniteLoop2 {

    public static void main(String[] args) {

        int i = 5;
        // It is actually an infinite loop that will print the same statement repeatedly.
        while (i < 10) {
            System.out.println("Hello World!");
        }
        System.out.println(" Unreachable statement");
    }
}

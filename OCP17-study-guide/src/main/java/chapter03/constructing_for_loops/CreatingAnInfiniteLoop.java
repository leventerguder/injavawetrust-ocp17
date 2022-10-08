package chapter03.constructing_for_loops;

public class CreatingAnInfiniteLoop {

    public static void main(String[] args) {

        // It is actually an infinite loop that will print the same statement repeatedly.
        for (; ;)
            System.out.println("Hello World!");
    }
}

package chapter03.constructing_for_loops;

public class ForStatement6 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 20; i = i + 5) {
            System.out.println(i);
        }
    }
}

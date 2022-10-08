package chapter03.constructing_for_loops;

public class PrintingElementsInReverse {

    public static void main(String[] args) {

        for (var counter = 5; counter > 0; counter--) {
            System.out.print(counter + " ");
        }

        System.out.println();

        for (var counter = 4; counter > 0; counter--) {
            System.out.print(counter + " ");
        }

        System.out.println();

        for (var counter = 4; counter >= 0; counter--) {
            System.out.print(counter + " ");
        }
    }
}

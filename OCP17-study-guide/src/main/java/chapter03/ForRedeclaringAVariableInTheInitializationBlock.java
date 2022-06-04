package chapter03;

public class ForRedeclaringAVariableInTheInitializationBlock {

    public static void main(String[] args) {
        fixRedeclaring();
    }

    private static void redeclaring() {
//        int x = 0;
//        for (int x = 4; x < 5; x++) // DOES NOT COMPILE
//            System.out.print(x + " ");
    }

    private static void fixRedeclaring() {
        int x = 0;
        for (x = 0; x < 5; x++)
            System.out.print(x + " ");
    }
}

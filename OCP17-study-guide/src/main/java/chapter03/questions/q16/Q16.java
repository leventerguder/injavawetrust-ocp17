package chapter03.questions.q16;

public class Q16 {

    public static void main(String[] args) {

        method1();
        System.out.println();

        method2();
        System.out.println();

        // method3();
        // System.out.println();

        method4();
        System.out.println();

        // method5(); // Infinite Loop
        // System.out.println();

        // method6(); //ArrayIndexOutOfBoundsException
        System.out.println();
    }

    private static void method1() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};

        int q = wolf.length;
        for (; ; ) {
            System.out.print(wolf[--q]);
            if (q == 0) break;
        }
    }

    private static void method2() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int m = wolf.length - 1; m >= 0; --m)
            System.out.print(wolf[m]);
    }

    private static void method3() {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int z = 0; z < wolf.length; z++)
            System.out.print(wolf[wolf.length - z]); // ArrayIndexOutOfBoundsException
    }


    private static void method4() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--)
            System.out.print(wolf[x]);
    }

    private static void method5() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        final int r = wolf.length;
        for (int w = r - 1; r > -1; w = r - 1)
            System.out.print(wolf[w]);
    }

    private static void method6() {

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for (int i = wolf.length; i > 0; --i)
            System.out.print(wolf[i]);
    }
}

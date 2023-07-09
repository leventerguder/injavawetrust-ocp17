package chapter03.questions.q16;

public class Q16 {

    public static void main(String[] args) {

        method1();
        System.out.println();
        method2();
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
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--)
            System.out.print(wolf[x]);
    }
}

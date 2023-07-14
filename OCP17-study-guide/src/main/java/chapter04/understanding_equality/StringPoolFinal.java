package chapter04.understanding_equality;

public class StringPoolFinal {

    public static void main(String[] args) {


        finalStrings();
        finalStringsV2();
        checkEquality();
    }

    private static void finalStrings() {
        String fullMsg = "hello world";

        final String msg1 = "hello";
        final String msg2 = " world";

        String msg3 = msg1 + msg2;

        System.out.println(fullMsg == msg3);
    }

    private static void finalStringsV2() {
        String fullMsg = "hello world";

        final String msg1 = helloMessage();
        final String msg2 = worldMessage();

        String msg3 = msg1 + msg2;

        System.out.println(fullMsg == msg3);
    }

    private static String helloMessage() {
        return "hello";
    }

    private static String worldMessage() {
        return " world";
    }


    private static void checkEquality() {

        String fullMsg = "hello world";

        String msg1 = "hello";
        String msg2 = " world";

        String msg3 = msg1 + msg2;

        System.out.println(fullMsg == msg3);
    }
}

package chapter04;

public class StringBuilderBasic {

    public static void main(String[] args) {

        stringLoop();
        stringBuilderLoop();

    }

    /*
    This sequence of events continues, and after 26 iterations through the loop, a total of 27 objects are instantiated,
    most of which are immediately eligible for garbage collection.
     */
    private static void stringLoop() {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

    }

    private static void stringBuilderLoop() {
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }

        System.out.println(alpha);
    }

}

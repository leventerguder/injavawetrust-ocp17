package chapter09.working_with_generics;

public class PairTest {

    public static void main(String[] args) {


        explicitlyProvided();

        typeInference();

    }

    private static void typeInference() {
        // This feature, known as type inference,
        // allows you to invoke a generic method as an ordinary method,
        // without specifying a type between angle brackets.

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.compare(p1, p2);

        System.out.println(same);
    }

    private static void explicitlyProvided() {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);

        System.out.println(same);
    }
}

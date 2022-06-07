package chapter04;

public class ReplacingValues {

    public static void main(String[] args) {

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
        System.out.println("abcabc".replace("a", "AX")); // AXbcAXbc
    }
}

package chapter04.creating_and_manipulating_strings;

public class MethodChaining {

    public static void main(String[] args) {

        withoutMethodChaining();
        methodChaining();
    }

    private static void withoutMethodChaining() {
        var start = "AniMaL ";
        var trimmed = start.trim();
        var lowercase = trimmed.toLowerCase();
        var result = lowercase.replace('a', 'A');
        System.out.println(result);
    }

    private static void methodChaining() {

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }
}

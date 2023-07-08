package chapter03.creating_decision_making_statements.patternmatching;

public class PatternMatching2 {

    public static void main(String[] args) {

        beforePatternMatching("sample-content");
        afterPatternMatching("sample-content");

    }

    private static void beforePatternMatching(Object obj) {

        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }

    }

    private static void afterPatternMatching(Object obj) {

        if (obj instanceof String s) {
            // Let pattern matching do the work!
            System.out.println(s.length());
        }

    }
}

package chapter02;

public class CompoundAssignmentOperators {

    private static void assignment() {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe; // Simple assignment operator
        System.out.println(camel);
    }

    private static void compoundAssignment() {
        int camel = 2, giraffe = 3;
        camel *= giraffe; // Compound assignment operator
        System.out.println(camel);
    }

    public static void main(String[] args) {

        assignment();
        compoundAssignment();
        compoundAssignmentCasting();
    }

    private static void compoundAssignmentCasting() {

        long goat = 10;
        int sheep = 5;
        // sheep = sheep * goat; // DOES NOT COMPILE
        sheep *= goat;

        // The compound operator will first cast sheep to a long, apply the multiplication of two long values, and then cast the result to an int.
        System.out.println(sheep);
    }
}

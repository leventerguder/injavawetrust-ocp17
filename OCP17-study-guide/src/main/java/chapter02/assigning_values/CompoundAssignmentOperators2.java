package chapter02.assigning_values;

public class CompoundAssignmentOperators2 {

    private static void assignment() {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe; // Simple assignment operator
        System.out.println("assignment:" + camel);
    }

    private static void compoundAssignment() {
        int camel = 2, giraffe = 3;
        camel *= giraffe; // Compound assignment operator
        System.out.println("Compound assignment:" + camel);
    }

    private static void compoundAssignment2() {

        /*
        The left side of the compound operator can be applied only to a variable that is already defined
        and cannot be used to declare a new variable. In this example,
        if camel were not already defined, the expression camel *= giraffe would not compile.
         */
        int giraffe = 3;
        // camel *= giraffe; // Compound assignment operator
        // System.out.println("Compound assignment:" + camel);
    }

    public static void main(String[] args) {

        assignment();
        compoundAssignment();
        compoundAssignment2();
    }


}

package chapter03.applying_switch_statements.expression;

public class CoveringAllPossibleValues {

    public static void main(String[] args) {

//        When adding switch expressions to the Java language, the authors decided this behavior would be unsupported. Every
//        switch expression must handle all possible values of the switch variable.
//
        int canis = 2;
//        String type = switch (canis) { // DOES NOT COMPILE
//            case 1 -> "dog";
//            case 2 -> "wolf";
//            case 3 -> "coyote";
//        };


        switch (canis) {
//            case 1 -> "dog";    // Not a statement. // DOES NOT COMPILE
//            case 2 -> "wolf";   // Not a statement. // DOES NOT COMPILE
//            case 3 -> "coyote"; // Not a statement. // DOES NOT COMPILE
        };

        switch (canis) {
            case 1 -> System.out.println("dog");
            case 2 -> System.out.println("wolf");
            case 3 -> System.out.println("coyote");
        }


        String type = switch (canis) {
            case 1 -> "dog";
            case 2 -> "wolf";
            case 3 -> "coyote";
            default -> throw new IllegalStateException("Unexpected value: " + canis);
        };
    }
}

package chapter03.applying_switch_statements;

public class SwitchExpression3 {

    public static void main(String[] args) {

        printSeason(10);
        printSeason(14);
        printSeason(4);

    }


    // Switch Expression ;
    //  A default branch is required unless all cases are covered or no value is returned.

    /*
    Most of the time, a switch expression returns a value, although printSeason() demonstrates one in which the return type is void.
    Since the type is void, it can’t be assigned to a variable.
    On the exam, you are more likely to see a switch expression that returns a value, but you should be aware that it is possible.
     */
    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }
    }

    public static void printSeason2(int month) {
        var seasons = switch (month) {
            case 1, 2, 3 -> "Winter";
            case 4, 5, 6 -> "Spring";
            case 7, 8, 9 -> "Summer";
            case 10, 11, 12 -> "Fall";
            default -> throw new IllegalStateException("Unexpected value: " + month); // default is Required!
            // A default branch is required unless all cases are covered or no value is returned.
        };
    }

}

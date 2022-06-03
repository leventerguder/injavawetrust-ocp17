package chapter03;

public class SwitchExpression {

    public static void main(String[] args) {
        printDayOfWeek(3);
        printDayOfWeek(8);

        printSeason(10);
        printSeason(14);
        printSeason(4);

    }

    public static void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value"; // default branch is required!
        };
        System.out.println(result);
    }

    //Notice that a semicolon is required after each switch expression.

    private static void semicolonRequired(int bear) {

//        var result = switch (bear) {
//            case 30 -> "Grizzly"
//            default -> "Panda"
//        }

        var result = switch (bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };
        System.out.println(result);
    }

    // Switch Expression ;
    //  A default branch is required unless all cases are covered or no value is returned.
    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }
    }


}

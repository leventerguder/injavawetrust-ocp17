package chapter03.applying_switch_statements;

public class SwitchStatement {

    public static void main(String[] args) {

        printDayOfWeekV1(3);
        printDayOfWeekV1(8);


        printDayOfWeekV2(3);
        printDayOfWeekV2(8);

        printSeason(10);
        printSeason(14);
        printSeason(4);

    }

    public static void printDayOfWeekV1(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }


    public static void printDayOfWeekV2(int day) {
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

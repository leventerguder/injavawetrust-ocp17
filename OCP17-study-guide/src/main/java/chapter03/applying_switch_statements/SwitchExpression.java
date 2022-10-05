package chapter03.applying_switch_statements;

public class SwitchExpression {

    public static void main(String[] args) {

        printDayOfWeekV1(3);
        printDayOfWeekV1(8);


        printDayOfWeekV2SwitchExpression(3);
        printDayOfWeekV2SwitchExpression(8);

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


    public static void printDayOfWeekV2SwitchExpression(int day) {
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
}

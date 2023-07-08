package chapter03.applying_switch_statements.statement;

public class ApplyingSwitchStatements1 {

    // difficult to read, and often not fun to maintain:
    public void printDayOfWeekV1(int day) {
        if (day == 0)
            System.out.print("Sunday");
        else if (day == 1)
            System.out.print("Monday");
        else if (day == 2)
            System.out.print("Tuesday");
        else if (day == 3)
            System.out.print("Wednesday");
    }

    public static void main(String[] args) {
        printDayOfWeekV2(10);
        printDayOfWeekV2(5);
        printDayOfWeekV2(1);
    }

    public static void printDayOfWeekV2(int day) {
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
}

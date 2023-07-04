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
        // ...
    }

    public void printDayOfWeekV2(int day) {
        switch (day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid value");
                break;
        }
    }
}

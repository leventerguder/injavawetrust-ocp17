package chapter03.applying_switch_statements;

public class ExitingWithBreakStatement {


    public static void main(String[] args) {
        printSeason(2);
        System.out.println();
        printSeasonWithBreak(2);
        System.out.println();
        printSeasonWithBreak(15);
    }

    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter");
            case 4, 5, 6:
                System.out.print("Spring");
            default:
                System.out.print("Unknown");
            case 7, 8, 9:
                System.out.print("Summer");
            case 10, 11, 12:
                System.out.print("Fall");
        }
    }

    /*
    It matches the first case statement and executes all of the branches in the order they are found, including the default statement.
    It is common, although certainly not required, to use a break statement after every case statement.
     */


    public static void printSeasonWithBreak(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter");
                break;
            case 4, 5, 6:
                System.out.print("Spring");
                break;
            default:
                System.out.print("Unknown");
                break;
            case 7, 8, 9:
                System.out.print("Summer");
                break;
            case 10, 11, 12:
                System.out.print("Fall");
                break;
        }
    }
}

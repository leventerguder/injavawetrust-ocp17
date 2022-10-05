package chapter03.applying_switch_statements;

public class SwitchExpression3 {

    public static void main(String[] args) {

        printSeason(10);
        printSeason(14);
        printSeason(4);

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

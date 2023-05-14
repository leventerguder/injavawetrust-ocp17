package chapter03.applying_switch_statements;

public class CombiningCaseValues {


    public static void main(String[] args) {
        afterJava14();
        System.out.println();
        beforeJava14();
    }

    private static void afterJava14() {

        int animal = 1;

        switch (animal) {
            case 1, 2:
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }
    }

    private static void beforeJava14() {

        int animal = 1;

        switch (animal) {
            case 1:
            case 2:
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }
    }
}

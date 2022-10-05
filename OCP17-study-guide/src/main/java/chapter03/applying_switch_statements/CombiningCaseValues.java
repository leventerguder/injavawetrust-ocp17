package chapter03.applying_switch_statements;

public class CombiningCaseValues {


    private void afterJava14() {

        int animal = 1;

        switch (animal) {
            case 1, 2:
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }
    }

    private void beforeJava14() {

        int animal = 1;

        switch (animal) {
            case 1:
            case 2:
                System.out.print("Lion");
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }
    }
}

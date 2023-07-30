package chapter07.working_with_enums;

public enum Colors {
    RED(10), BLUE(10, 20), YELLOW("value1");

    private int num1;
    private int num2;
    private String value1;

    Colors(int num1) {
        System.out.println("int - constructor");
        this.num1 = num1;
    }

    Colors(int num1, int num2) {
        System.out.println("int - int constructor");
        this.num1 = num1;
        this.num2 = num2;
    }

    Colors(String value1) {
        System.out.println("String - constructor");
        this.value1 = value1;
    }
}

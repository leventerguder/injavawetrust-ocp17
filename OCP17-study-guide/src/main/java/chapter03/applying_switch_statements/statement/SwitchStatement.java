package chapter03.applying_switch_statements.statement;

public class SwitchStatement {

    public static void main(String[] args) {

        Season season = Season.SUMMER;

        switch (season) {

            case SPRING:
                System.out.println("Warm");
                break;
            case SUMMER:
                System.out.println("Hot!");
                break;
            case FALL:
                System.out.println("Cool");
                break;
            case WINTER:
                System.out.println("Cold");
                break;
        }
    }
}

enum Season {
    SPRING, SUMMER, FALL, WINTER
}
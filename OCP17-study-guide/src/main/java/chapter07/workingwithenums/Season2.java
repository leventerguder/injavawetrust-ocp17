package chapter07.workingwithenums;

public enum Season2 {

    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");
    private final String expectedVisitors;

    private Season2(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
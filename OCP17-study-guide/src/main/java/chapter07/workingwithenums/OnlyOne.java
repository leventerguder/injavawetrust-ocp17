package chapter07.workingwithenums;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}

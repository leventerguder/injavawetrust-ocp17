package chapter07.workingwithenums;

public class EnumsValueOfMethod {

    public static void main(String[] args) {
        Season s = Season.valueOf("SUMMER"); // SUMMER
        Season t = Season.valueOf("summer"); // IllegalArgumentException
    }
}

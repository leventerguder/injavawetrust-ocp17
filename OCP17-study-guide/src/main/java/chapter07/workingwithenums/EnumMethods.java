package chapter07.workingwithenums;

public class EnumMethods {

    public static void main(String[] args) {
        for (var season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
}

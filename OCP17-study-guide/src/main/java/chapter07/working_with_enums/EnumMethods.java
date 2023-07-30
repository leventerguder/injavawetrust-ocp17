package chapter07.working_with_enums;

public class EnumMethods {

    public static void main(String[] args) {

        Season[] array = Season.values();

        for (var season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        // if ( Season.SUMMER == 2) {} // DOES NOT COMPILE
    }
}

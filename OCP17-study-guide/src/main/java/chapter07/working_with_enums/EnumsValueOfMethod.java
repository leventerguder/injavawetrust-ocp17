package chapter07.working_with_enums;

public class EnumsValueOfMethod {

    public static void main(String[] args) {
        Season s = Season.valueOf("SUMMER"); // SUMMER

        System.out.println(s);

        Season t = Season.valueOf("summer"); // IllegalArgumentException

    }
}

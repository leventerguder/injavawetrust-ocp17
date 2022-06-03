package chapter03;

public class SwitchExpressionCoveringAllPossibleValuesEnum {

    public static void main(String[] args) {

        System.out.println(getWeather(Season.SPRING));

    }

    /*
    Since all possible permutations of Season are covered,
    a default branch is not required in this switch expression.
    You can include an optional default branch, though, even if you cover all known values.
     */
    private static String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}

enum Season {WINTER, SPRING, SUMMER, FALL}
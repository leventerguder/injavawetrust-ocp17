package chapter07.questions.q13;

public class Weather {
    enum Seasons {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Seasons v = null;
        switch (v) {
//            case Seasons.SPRING -> System.out.print("s");  // DOES NOT COMPILE
//            case Seasons.WINTER -> System.out.print("w");  // DOES NOT COMPILE
//            case Seasons.SUMMER -> System.out.print("m");  // DOES NOT COMPILE
            default -> System.out.println("missing data");
        }
    }
}

package chapter01.understanding_data_types;

public class LiteralUnderscoreCharacter {

    public static void main(String[] args) {

        int million1 = 1000000;
        int million2 = 1_000_000;

        /*
        You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal
        point, or right after a decimal point.
         */

        // double notAtStart = _1000 .00; // DOES NOT COMPILE
        // double notAtEnd = 1000.00_; // DOES NOT COMPILE
        // double notByDecimal = 1000_.00; // DOES NOT COMPILE
        // double notAfterDecimal = 1000._00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0;  // Ugly, but compiles
        double reallyUgly = 1__________2; //Also compiles

// DOES NOT COMPILE
    }
}

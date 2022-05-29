package chapter02;

public class CastingValuesVsVariables {

    public static void main(String[] args) {

        //  The compiler doesn’t require casting when working with literal values that fit into the data type.
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;


        //short boots = 2 + hat; // DOES NOT COMPILE
        //  hat is a variable, not a value, and both operands are automatically promoted to int

        //byte gloves = 7 * 100; // DOES NOT COMPILE
        // 700 triggers an overflow for byte, which has a maximum value of 127.
    }
}

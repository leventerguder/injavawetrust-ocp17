package chapter02.assigning_values;

public class ApplyingCasting3 {

    public static void main(String[] args) {

        short mouse = 10;
        short hamster = 3;
        //the cast in the last line is applied to mouse, and mouse alone.
        // short capybara = (short)mouse * hamster; // DOES NOT COMPILE

        //casting is performed successfully, but the resulting value is automatically promoted to int because it is used with the binary arithmetic operator (+).
        // short capybara = 1 + (short)(mouse * hamster); // DOES NOT COMPILE
    }
}

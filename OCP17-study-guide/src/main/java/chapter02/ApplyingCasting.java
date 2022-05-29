package chapter02;

public class ApplyingCasting {

    private void casting1() {

        int fish = (int) 1.0;
        short bird = (short) 1921222; // Stored as 20678
        int mammal = (int) 9f;
        //long reptile = (long)192301398193810323; // DOES NOT COMPILE
        long reptile = 192301398193810323L;

    }

    private void casting2() {

        //As you may remember, short values are automatically promoted to int when applying any arithmetic operator, with the
        //resulting value being of type int.

        short mouse = 10;
        short hamster = 3;
        // short capybara = mouse * hamster; // DOES NOT COMPILE
        short capybara = (short) (mouse * hamster);
    }

    private void casting3() {


        short mouse = 10;
        short hamster = 3;
        //the cast in the last line is applied to mouse, and mouse alone.
        // short capybara = (short)mouse * hamster; // DOES NOT COMPILE

        //casting is performed successfully, but the resulting value is automatically promoted to int because it is used with the binary arithmetic operator (+).
        // short capybara = 1 + (short)(mouse * hamster); // DOES NOT COMPILE

    }
}

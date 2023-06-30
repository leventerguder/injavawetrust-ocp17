package chapter02.assigning_values;

public class ApplyingCasting2 {

    public static void main(String[] args) {
        //As you may remember, short values are automatically promoted to int when applying any arithmetic operator, with the
        //resulting value being of type int.

        short mouse = 10;
        short hamster = 3;
        // short capybara = mouse * hamster; // DOES NOT COMPILE
        short capybara = (short) (mouse * hamster);

        System.out.println(capybara);

        byte b1 = 100;
        byte b2 = 30;
        byte b3 = (byte) (b1 + b2);

        System.out.println(b3);


    }
}

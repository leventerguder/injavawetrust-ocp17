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


        short capybara2 = 10 * 3;
        System.out.println(capybara2);


    }
}

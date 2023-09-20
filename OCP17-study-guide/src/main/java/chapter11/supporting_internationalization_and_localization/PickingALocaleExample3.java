package chapter11.supporting_internationalization_and_localization;

import java.util.Locale;

public class PickingALocaleExample3 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        Locale locale = new Locale("fr");
        Locale.setDefault(locale);
        System.out.println(Locale.getDefault()); // fr

        // the Locale changes for only that one Java program.
        // It does not change any settings on your computer.
    }
}

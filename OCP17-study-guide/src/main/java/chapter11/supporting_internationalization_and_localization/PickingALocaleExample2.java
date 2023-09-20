package chapter11.supporting_internationalization_and_localization;

import java.util.Locale;

public class PickingALocaleExample2 {

    public static void main(String[] args) {

        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE

        System.out.println(Locale.ENGLISH); // en
        System.out.println(Locale.UK); // en_GB
        System.out.println(Locale.US); // en_US

        System.out.println(Locale.ITALIAN); // it
        System.out.println(Locale.ITALY); // it_IT


        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN


        System.out.println(new Locale("xx")); // xx
        System.out.println(new Locale("xx", "XX")); // xx_XX


        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println(l1);
        System.out.println(l2);

    }
}

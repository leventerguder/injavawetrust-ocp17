package chapter11.supporting_internationalization_and_localization.picking_a_locale;

import java.util.Arrays;
import java.util.Locale;

public class GetAvailableLocaleExample {

    public static void main(String[] args) {

        Locale[] availableLocales = Locale.getAvailableLocales();
        Arrays.stream(availableLocales).forEach(System.out::println);

        System.out.println("allLocales count : " +  availableLocales.length);
    }
}

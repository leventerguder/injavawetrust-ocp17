package chapter11.supporting_internationalization_and_localization.picking_a_locale;

import java.util.Locale;

public class LocaleMethodsExample {

    public static void main(String[] args) {

        Locale trLocale = new Locale("tr", "TR");

        System.out.println(trLocale.getCountry());
        System.out.println(trLocale.getDisplayCountry());
        System.out.println(trLocale.getDisplayCountry(trLocale));
        System.out.println(trLocale.getISO3Country());
        System.out.println(trLocale.getLanguage());
        System.out.println(trLocale.getDisplayLanguage());
        System.out.println(trLocale.getDisplayLanguage(trLocale));
        System.out.println(trLocale.getDisplayLanguage(Locale.ITALY));
    }
}

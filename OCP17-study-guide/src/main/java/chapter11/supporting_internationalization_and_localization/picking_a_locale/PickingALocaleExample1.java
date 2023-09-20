package chapter11.supporting_internationalization_and_localization.picking_a_locale;

import java.util.Locale;

public class PickingALocaleExample1 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }
}

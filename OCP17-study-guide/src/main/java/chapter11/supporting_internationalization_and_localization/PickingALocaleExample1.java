package chapter11.supporting_internationalization_and_localization;

import java.util.Locale;

public class PickingALocaleExample1 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }
}

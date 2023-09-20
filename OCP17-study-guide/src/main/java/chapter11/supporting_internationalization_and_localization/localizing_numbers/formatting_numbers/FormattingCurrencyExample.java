package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingCurrencyExample {

    public static void main(String[] args) {

        var us = NumberFormat.getCurrencyInstance(Locale.US);

        var uk = NumberFormat.getCurrencyInstance(Locale.UK);

        var de = NumberFormat.getCurrencyInstance(Locale.GERMANY);


        double price = 48;

        System.out.println(us.format(price));
        System.out.println(uk.format(price));
        System.out.println(de.format(price));
    }
}

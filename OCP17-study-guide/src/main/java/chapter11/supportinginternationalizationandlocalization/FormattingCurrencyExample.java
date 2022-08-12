package chapter11.supportinginternationalizationandlocalization;

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

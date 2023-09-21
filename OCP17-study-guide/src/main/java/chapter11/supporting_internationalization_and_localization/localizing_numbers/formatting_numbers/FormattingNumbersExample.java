package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbersExample {

    public static void main(String[] args) {

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth)); // 266,666

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth)); // 266.666

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth)); // 266 666

        NumberFormat tr = NumberFormat.getInstance(new Locale("tr", "TR"));
        System.out.println(tr.format(attendeesPerMonth)); // 266.666

        System.out.println(tr.getClass()); // java.text.DecimalFormat

    }
}

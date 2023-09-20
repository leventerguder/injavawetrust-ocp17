package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbersExample2 {

    public static void main(String[] args) {

        double attendeesPerMonth = 100_250.5678;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth)); // 266,666

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth)); // 266.666

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth)); // 266 666

        var tr = NumberFormat.getInstance(new Locale("tr", "TR"));
        System.out.println(tr.format(attendeesPerMonth)); // 266 666
    }
}

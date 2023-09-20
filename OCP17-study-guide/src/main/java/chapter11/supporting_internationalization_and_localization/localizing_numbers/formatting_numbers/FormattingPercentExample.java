package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingPercentExample {

    public static void main(String[] args) {

        double successRate = 0.802;
        var us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(successRate)); // 80%
        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gr.format(successRate)); // 80 %

        var uk = NumberFormat.getPercentInstance(Locale.UK);
        System.out.println(uk.format(successRate)); // 80%
    }
}

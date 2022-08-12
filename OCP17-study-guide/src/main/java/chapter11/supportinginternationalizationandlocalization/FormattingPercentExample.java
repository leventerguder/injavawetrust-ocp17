package chapter11.supportinginternationalizationandlocalization;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingPercentExample {

    public static void main(String[] args) {

        double successRate = 0.802;
        var us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(successRate)); // 80%
        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gr.format(successRate)); // 80 %
    }
}

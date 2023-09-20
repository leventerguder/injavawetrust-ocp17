package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_with_compactnumberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample3 {

    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        System.out.println(formatter.format(1000)); // 1 thousand
        System.out.println(formatter.format(1000000)); // 1 million
        System.out.println(formatter.format(1499)); // 1 thousand
        System.out.println(formatter.format(1500)); // 2 thousand

        formatter = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);

        System.out.println(formatter.format(1000));
        System.out.println(formatter.format(1000000));
    }
}

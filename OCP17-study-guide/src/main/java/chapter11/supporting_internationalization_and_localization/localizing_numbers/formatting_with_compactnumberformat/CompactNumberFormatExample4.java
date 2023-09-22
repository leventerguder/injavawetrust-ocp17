package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_with_compactnumberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample4 {

    public static void main(String[] args) {

        NumberFormat longFormatter = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        NumberFormat shortFormatter = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);


        System.out.println(longFormatter.format(5_100_000_000_000L)); // 5 trillion
        System.out.println(shortFormatter.format(5_100_000_000_000L)); // 5T

    }
}

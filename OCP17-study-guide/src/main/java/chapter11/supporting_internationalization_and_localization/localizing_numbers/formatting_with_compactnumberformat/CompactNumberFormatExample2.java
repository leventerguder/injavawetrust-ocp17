package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_with_compactnumberformat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

import static java.text.NumberFormat.Style;

public class CompactNumberFormatExample2 {

    public static void main(String[] args) {

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
                NumberFormat.getNumberInstance());

        formatters.map(s -> s.format(314_900_000)).forEach(System.out::println);
    }
}

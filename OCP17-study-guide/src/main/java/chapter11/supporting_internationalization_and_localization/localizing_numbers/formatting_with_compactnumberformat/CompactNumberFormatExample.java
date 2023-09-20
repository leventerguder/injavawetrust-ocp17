package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_with_compactnumberformat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

import static java.text.NumberFormat.*;

public class CompactNumberFormatExample {

    public static void main(String[] args) {

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.UK, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.UK, Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
                NumberFormat.getCompactNumberInstance(new Locale("tr","TR"), Style.SHORT),
                NumberFormat.getCompactNumberInstance(new Locale("tr","TR"), Style.LONG),
                NumberFormat.getNumberInstance());

        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);

    }
}

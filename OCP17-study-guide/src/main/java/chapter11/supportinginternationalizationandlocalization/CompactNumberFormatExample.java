package chapter11.supportinginternationalizationandlocalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

import static java.text.NumberFormat.*;

public class CompactNumberFormatExample {

    public static void main(String[] args) {

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
                NumberFormat.getNumberInstance());

        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);

    }
}

package chapter04.creating_and_manipulating_strings;

public class FormattingValues3 {

    public static void main(String[] args) {

        // Mixing data types may cause exceptions at runtime.

        var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException
    }
}

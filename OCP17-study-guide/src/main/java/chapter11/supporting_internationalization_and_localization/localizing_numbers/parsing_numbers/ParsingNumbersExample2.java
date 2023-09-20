package chapter11.supporting_internationalization_and_localization.localizing_numbers.parsing_numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingNumbersExample2 {

    public static void main(String[] args) {

        try {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            System.out.println(numberFormat.parse("123.456789"));

            numberFormat.setParseIntegerOnly(true);
            System.out.println(numberFormat.parse("123.456789"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

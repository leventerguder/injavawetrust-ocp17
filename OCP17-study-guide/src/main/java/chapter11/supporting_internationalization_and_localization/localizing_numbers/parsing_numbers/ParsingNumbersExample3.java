package chapter11.supporting_internationalization_and_localization.localizing_numbers.parsing_numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingNumbersExample3 {

    public static void main(String[] args) {

        try {
            NumberFormat numberFormatGE = NumberFormat.getInstance(Locale.GERMANY);
            System.out.println(numberFormatGE.parse("1.123,535"));

            NumberFormat numberFormatUS = NumberFormat.getInstance(Locale.US);
            System.out.println(numberFormatUS.parse("1.123,535"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

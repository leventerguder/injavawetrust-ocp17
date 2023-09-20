package chapter11.supporting_internationalization_and_localization.localizing_numbers.parsing_numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingCurrencyExample {

    public static void main(String[] args) throws ParseException {

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value); // 92807.99
    }
}

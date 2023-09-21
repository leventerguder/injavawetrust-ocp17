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

        NumberFormat numberFormatTR = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));
        Number value2 = numberFormatTR.parse("₺123,46");
        System.out.println(value2);

        NumberFormat numberFormatDE = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(numberFormatDE.parse("123,46 €"));
    }
}

package chapter11.supporting_internationalization_and_localization;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParsingCurrencyExample {

    public static void main(String[] args) throws ParseException {

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value = (Double) cf.parse(income);
        System.out.println(value); // 92807.99
    }
}

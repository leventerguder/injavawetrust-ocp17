package chapter11.supporting_internationalization_and_localization.localizing_numbers.parsing_numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingNumbersExample {

    public static void main(String[] args) throws ParseException {

        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); // 40.45
        
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40

        var uk = NumberFormat.getInstance(Locale.UK);
        System.out.println(uk.parse(s)); // 40.45
    }
}

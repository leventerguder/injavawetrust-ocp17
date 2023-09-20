package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormattingCurrencyExample3 {

    public static void main(String[] args) {


        NumberFormat numberCurrencyFormatGE = NumberFormat
                .getCurrencyInstance(Locale.GERMANY);
        NumberFormat numberCurrencyFormatIT = NumberFormat
                .getCurrencyInstance(Locale.ITALY);
        NumberFormat numberCurrencyFormatUK = NumberFormat
                .getCurrencyInstance(Locale.UK);
        NumberFormat numberCurrencyFormatJP = NumberFormat
                .getCurrencyInstance(Locale.JAPAN);
        NumberFormat numberCurrencyFormatTR = NumberFormat
                .getCurrencyInstance(new Locale("tr", "TR"));

        double salary = 123.456;
        System.out.println(numberCurrencyFormatGE.format(salary));
        System.out.println(numberCurrencyFormatIT.format(salary));
        System.out.println(numberCurrencyFormatUK.format(salary));
        System.out.println(numberCurrencyFormatJP.format(salary));
        System.out.println(numberCurrencyFormatTR.format(salary));
    }
}

package chapter11.supporting_internationalization_and_localization;

import java.util.Currency;
import java.util.Locale;

public class FormattingCurrencyExample2 {

    public static void main(String[] args) {

        Currency usCurrency = Currency.getInstance(Locale.US);
        String usdCode = usCurrency.getCurrencyCode();
        String usdSymbol = usCurrency.getSymbol(Locale.US);

        Currency caCurrency = Currency.getInstance(Locale.CANADA);
        String caCode = caCurrency.getCurrencyCode();
        String caSymbol = caCurrency.getSymbol(Locale.CANADA);

        Currency ukCurrency = Currency.getInstance(Locale.UK);
        String gbpCode = ukCurrency.getCurrencyCode();
        String gbpSymbol = ukCurrency.getSymbol(Locale.UK);

        Currency geCurrency = Currency.getInstance(Locale.GERMANY);
        String eurCode = geCurrency.getCurrencyCode();
        String eurSymbol = geCurrency.getSymbol(Locale.GERMANY);

        Currency trCurrency = Currency.getInstance(new Locale("tr", "TR"));
        String trCode = trCurrency.getCurrencyCode();
        String trSymbol = trCurrency.getSymbol(new Locale("tr", "TR"));

        System.out.println(usdCode + " " + usdSymbol);
        System.out.println(caCode + " " + caSymbol);
        System.out.println(gbpCode + " " + gbpSymbol);
        System.out.println(eurCode + " " + eurSymbol);
        System.out.println(trCode + " " + trSymbol);
    }
}

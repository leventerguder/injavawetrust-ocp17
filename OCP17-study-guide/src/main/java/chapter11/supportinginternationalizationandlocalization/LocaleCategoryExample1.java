package chapter11.supportinginternationalizationandlocalization;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCategoryExample1 {

    public static void printCurrency(Locale locale, double money) {
        System.out.println(NumberFormat.getCurrencyInstance().format(money) + ", " + locale.getDisplayLanguage());
    }

    public static void main(String[] args) {

        var spain = new Locale("es", "ES");
        var money = 1.23;

        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain, money); // $1.23, Spanish

        // Print with selected locale display

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        printCurrency(spain, money); // $1.23, español

        // Print with selected locale format
        Locale.setDefault(Locale.Category.FORMAT, spain);
        printCurrency(spain, money); // 1,23 €, español
    }
}

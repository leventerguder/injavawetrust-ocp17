package chapter11.supporting_internationalization_and_localization.specifying_a_locale_category;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleCategoryExample2 {


    public static void main(String[] args) {

        var localeTR = new Locale("tr", "TR");
        var money = 1.23;
        var today = LocalDate.now();

        Locale.setDefault(new Locale("en", "US"));

        System.out.println("## Default en_US ### ");
        System.out.println(NumberFormat.getCurrencyInstance().format(money));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(today));
        System.out.println(localeTR.getDisplayLanguage());

        System.out.println("## Category.DISPLAY tr_TR ### ");
        Locale.setDefault(Locale.Category.DISPLAY, localeTR);

        System.out.println(localeTR.getDisplayLanguage());

        System.out.println("## Category.FORMAT tr_TR ### ");
        Locale.setDefault(Locale.Category.FORMAT, localeTR);

        System.out.println(NumberFormat.getCurrencyInstance().format(money));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(today));
    }
}

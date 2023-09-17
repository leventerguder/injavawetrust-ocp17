package chapter11.loading_properties_with_resourcebundles;

import java.util.ResourceBundle;
import java.util.Locale;

public class ResourceBundleExample1 {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        printWelcomeMessage(us); // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert

    }
}
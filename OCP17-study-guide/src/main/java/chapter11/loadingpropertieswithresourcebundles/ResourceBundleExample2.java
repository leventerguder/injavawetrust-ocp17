package chapter11.loadingpropertieswithresourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample2 {

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream()
                .map(k -> k + ": " + rb.getString(k)).forEach(System.out::println);

    }
}

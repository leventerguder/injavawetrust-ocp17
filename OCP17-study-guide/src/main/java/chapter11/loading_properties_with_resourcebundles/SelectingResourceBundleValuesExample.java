package chapter11.loading_properties_with_resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class SelectingResourceBundleValuesExample {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

        System.out.println(rb.getString("hello")); // Hello

        // Zoo_en_CA doesn't have the "hello" , Zoo_en will be used.

        System.out.println(rb.getString("name")); // Vancouver Zoo

        // Zoo_en_CA doesn't have the "name" , Zoo_en next , Zoo_en also doesn't
        // have it. Zoo.properties is the next.

        System.out.println(rb.getString("open"));  // The zoo is open

        // Zoo_en_CA doesn't have the "open". Zoo_en has it.

        System.out.println(rb.getString("visitors")); // Canada visitors

        // Zoo_en_CA has "visitor"
    }
}

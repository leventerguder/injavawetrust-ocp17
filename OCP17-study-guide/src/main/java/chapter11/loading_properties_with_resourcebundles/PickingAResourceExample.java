package chapter11.loading_properties_with_resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class PickingAResourceExample {

    public static void main(String[] args) {


        Locale.setDefault(new Locale("hi"));
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("en"));

        // 1. Zoo_en.properties
        // 2. Zoo_hi.properties
        // 3. Zoo.properties
    }
}

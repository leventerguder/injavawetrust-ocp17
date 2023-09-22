package chapter11.loading_properties_with_resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample3 {

    public static void main(String[] args) {


        Locale localeTR = new Locale("tr");

        ResourceBundle rb = ResourceBundle.getBundle("messages", localeTR);
        String helloMessage = rb.getString("hello");
        String welcomeMessage = rb.getString("welcome");
        String goodByMessage = rb.getString("goodBye");
        String defaultMessage = rb.getString("defaultMessage");

        System.out.println(helloMessage);
        System.out.println(welcomeMessage);
        System.out.println(goodByMessage);
        System.out.println(defaultMessage);

        System.out.println(rb.getClass());
        // java.util.PropertyResourceBundle
    }
}

package chapter11.loading_properties_with_resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleExample1 {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("chapter11.loading_properties_with_resourcebundles.Message",
                new Locale("tr", "TR"));

        String helloMessage = rb.getString("hello");
        Object welcomeMessage = rb.getObject("welcome");
        Integer number = (Integer) rb.getObject("number");
        //
        System.out.println(helloMessage);
        System.out.println(welcomeMessage);
        System.out.println(number);
    }
}

package chapter11.questions.q08;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q08 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins");
        System.out.println(b.getString("name"));
    }
}

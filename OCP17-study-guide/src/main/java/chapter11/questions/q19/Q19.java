package chapter11.questions.q19;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q19 {

    public static void main(String[] args) {

        var fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins", fr);
        String name = b.getString("name");
        String age = b.getString("age");

        System.out.println(name + " " + age);
    }
}

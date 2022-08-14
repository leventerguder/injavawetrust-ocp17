package chapter11.loadingpropertieswithresourcebundles;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class FormattingMessageExample {

    public static void main(String[] args) {

        var rb = ResourceBundle.getBundle("greeting");
        String format = rb.getString("helloByName");
        System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
    }
}

package chapter11.loading_properties_with_resourcebundles;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Merhaba"},
                {"welcome", "Hos geldiniz."},
                {"goodBye", "Gule gule"},
                {"number", 100}
        };
    }

}
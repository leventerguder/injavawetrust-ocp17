package chapter11.loading_properties_with_resourcebundles;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Hello"},
                {"welcome", "Welcome"},
                {"goodBye", "Goodbye"},
                {"number", 100}
        };
    }

}
package chapter13.applying_annotations.example05;

import java.util.List;

public @interface Music {
    String[] genres();

    // List<String> unsupported();
    //Invalid type 'List<String>' for annotation member
}
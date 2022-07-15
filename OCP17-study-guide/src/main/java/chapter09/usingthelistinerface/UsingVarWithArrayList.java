package chapter09.usingthelistinerface;

import java.util.ArrayList;

public class UsingVarWithArrayList {

    public static void main(String[] args) {

        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s : strings) {
            System.out.println(s);
        }

        var list = new ArrayList<>();
        list.add("a");
        // for (String s : list) {} // DOES NOT COMPILE

        // The type of the var is ArrayList<Object>

        for (Object s : list) {
            System.out.println(s);
        }
    }
}

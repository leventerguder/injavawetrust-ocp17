package chapter09.questions.q11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Wildcard {

    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {

        Wildcard card = new Wildcard();

        // List<?> list = new HashSet<String>(); // DOES NOT COMPILE

        // ArrayList<? super Date> list = new ArrayList<Date>();

        // List<?> list = new ArrayList<?>(); // DOES NOT COMPILE

        // List<Exception> list = new LinkedList<IOException>();

        ArrayList<? extends Number> list = new ArrayList<Integer>();

        card.showSize(list);

    }
}

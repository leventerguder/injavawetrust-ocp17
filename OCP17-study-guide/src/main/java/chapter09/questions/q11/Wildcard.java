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

        // List<?> list1 = new HashSet<String>(); // DOES NOT COMPILE

        ArrayList<? super Date> list2 = new ArrayList<Date>();

        // List<?> list3 = new ArrayList<?>(); // DOES NOT COMPILE

        // List<Exception> list4 = new LinkedList<IOException>();

        ArrayList<? extends Number> list5 = new ArrayList<Integer>();

        card.showSize(list2);
        card.showSize(list5);

    }
}

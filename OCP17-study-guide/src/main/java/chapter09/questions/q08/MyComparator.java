package chapter09.questions.q08;


import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (var s : values)
            System.out.print(s + " ");
    }
}
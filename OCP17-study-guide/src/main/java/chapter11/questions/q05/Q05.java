package chapter11.questions.q05;

import java.text.NumberFormat;
import java.util.Locale;

public class Q05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Q05 ref = new Q05();
        ref.print(100_102.2);
    }

    public void print(double t) {
        System.out.print(NumberFormat.getCompactNumberInstance().format(t));
        System.out.print(NumberFormat.getCompactNumberInstance(
                Locale.getDefault(), NumberFormat.Style.SHORT).format(t));
        System.out.print(NumberFormat.getCurrencyInstance().format(t));
    }
}

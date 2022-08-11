package chapter11.formattingvalues;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatExamples {

    public static void main(String[] args) {

        double d = 1234.567;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d)); // 1,234.6

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d)); // 000,001,234.56700

        NumberFormat f3 = new DecimalFormat("Your Balance $#,###,###.##");
        System.out.println(f3.format(d)); // Your Balance $1,234.57
    }
}

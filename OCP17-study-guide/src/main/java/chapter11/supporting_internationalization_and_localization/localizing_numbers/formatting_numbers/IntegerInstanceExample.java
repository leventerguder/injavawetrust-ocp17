package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;

public class IntegerInstanceExample {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nfIntegerInstance = NumberFormat.getIntegerInstance();


        System.out.println(nf.format(123.4567));
        System.out.println(nfIntegerInstance.format(123.4567));
        System.out.println(nfIntegerInstance.format(123.5));
    }
}

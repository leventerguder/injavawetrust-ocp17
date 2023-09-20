package chapter11.supporting_internationalization_and_localization.localizing_numbers.formatting_numbers;

import java.text.NumberFormat;

public class FormattingNumbersExample3 {

    public static void main(String[] args) {

        printMinAndMaxFractionDigits();

        setMaximumFractionDigitsExample();

        setMinimumFractionDigitsExample();
//
        setMaximumIntegerDigits();

        setMinimumIntegerDigits();
    }

    private static void printMinAndMaxFractionDigits() {

        System.out.println("### printMinAndMaxFractionDigits ###");
        NumberFormat numberFormat = NumberFormat.getInstance();

        int maxFractionDigits = numberFormat.getMaximumFractionDigits(); // Maximum 3
        int minFractionDigits = numberFormat.getMinimumFractionDigits(); // Minimum 0

        System.out.println("Minimum fraction digits :" + minFractionDigits);
        System.out.println("Maximum fraction digits :" + maxFractionDigits);
    }

    private static void setMaximumFractionDigitsExample() {

        System.out.println("### setMaximumFractionDigitsExample ###");
        NumberFormat numberFormat = NumberFormat.getInstance();
        double salary = 123.456789;
        System.out.println("salary : " + salary);
        System.out.println("numberFormat.format : " + numberFormat.format(salary));

        numberFormat.setMaximumFractionDigits(5);

        System.out.println("After setMaximumFractionDigits : " + numberFormat.format(salary));
    }


    private static void setMinimumFractionDigitsExample() {

        System.out.println("### setMinimumFractionDigitsExample ###");
        double salary = 123;
        System.out.println(salary);

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(2);

        System.out.println(numberFormat.format(salary));
    }

    private static void setMaximumIntegerDigits() {

        System.out.println("### setMaximumIntegerDigits ###");
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumIntegerDigits(5);
        System.out.println(numberFormat.format(123456789));
    }

    private static void setMinimumIntegerDigits() {

        System.out.println("### setMinimumIntegerDigits ###");

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumIntegerDigits(3);
        System.out.println(numberFormat.format(15));
        System.out.println(numberFormat.format(1));
        System.out.println(numberFormat.format(120));
    }

}

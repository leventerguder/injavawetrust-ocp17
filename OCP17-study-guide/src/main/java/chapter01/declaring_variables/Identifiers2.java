package chapter01.declaring_variables;

public class Identifiers2 {
}

/*
The first letter should be capitalized, and if several words are linked together to form the name,
the first letter of the inner words should be uppercase
 */

class Dog {

    /*
    Java constants are created by marking variables static and final.
    They should be named using uppercase letters with underscore characters as separators
     */
    private static final int MIN_HEIGHT = 10;
}

class Account {


    /*
    Like methods, the camelCase format should be used, starting with a lowercase letter.
     */
    private int accountBalance;

    /*
    The first letter should be lowercase, and then normal camelCase rules should be used.
     */
    private int getBalance() {
        return 0;
    }

    private void doCalculation() {

    }

    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

class PrintWriter {

}

class animal {
} // Compile but not good.

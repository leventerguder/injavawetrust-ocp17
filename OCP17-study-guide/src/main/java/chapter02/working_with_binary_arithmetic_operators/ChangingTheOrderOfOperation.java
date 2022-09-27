package chapter02.working_with_binary_arithmetic_operators;

public class ChangingTheOrderOfOperation {

    public static void main(String[] args) {

        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);

        int priceOrder = 2 * ((5 + 3) * 4 - 8);
        System.out.println(priceOrder);

    }
}

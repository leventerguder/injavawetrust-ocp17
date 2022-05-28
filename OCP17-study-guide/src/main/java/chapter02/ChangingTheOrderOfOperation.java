package chapter02;

public class ChangingTheOrderOfOperation {

    public static void main(String[] args) {

        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);

        int priceOrder = 2 * ((5 + 3) * 4 - 8);
        System.out.println(priceOrder);

    }
}

package chapter04;

public class FormattingValues {

    public static void main(String[] args) {

        var name = "Kate";
        var orderId = 5;

        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

    }
}

package chapter03.writing_while_loops;

public class WhileStatement {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
    }
}

package chapter02;

public class CheckingForUnperformedSideEffects {

    public static void main(String[] args) {

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit);

        // Because rabbit >= 6 is true, the increment operator on the right side of the expression is never evaluated,
        // so the output is 6.
    }
}

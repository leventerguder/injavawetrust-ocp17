package chapter02.comparing_values;

public class EqualityOperator3 {

    public static void main(String[] args) {
        boolean bear = false;
        boolean polar = (bear = true); // Not comparing operator!
        System.out.println(polar); // true
    }
}

package chapter02.applying_unary_operators;

public class LogicalComplementOperator {

    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.print(isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.print(isAnimalAsleep); // true

    }
}

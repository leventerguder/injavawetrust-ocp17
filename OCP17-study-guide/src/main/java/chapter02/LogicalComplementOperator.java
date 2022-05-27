package chapter02;

public class LogicalComplementOperator {

    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.print(isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.print(isAnimalAsleep); // true

    }
}

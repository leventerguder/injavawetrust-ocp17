package chapter02.questions.q06;

public class CandyCounter {
//    static long addCandy(double fruit, float vegetables) {
//        return (int) fruit + vegetables; // DOES NOT COMPILE
//    }

    static long addCandyFixed(double fruit, float vegetables) {
        return (int) (fruit + vegetables);
    }

    static long addCandyFixed2(double fruit, float vegetables) {
        return (long) (fruit + vegetables);
    }

    public static void main(String[] args) {
//        System.out.print(addCandy(1.4, 2.4f) + ", ");
//        System.out.print(addCandy(1.9, (float) 4) + ", ");
//        System.out.print(addCandy((long) (int) (short) 2, (float) 4));

        System.out.println();
        System.out.print(addCandyFixed(1.4, 2.4f) + ", ");
        System.out.print(addCandyFixed(1.9, (float) 4) + ", ");
        System.out.print(addCandyFixed((long) (int) (short) 2, (float) 4));
        // Remember that casting floating-point numbers to integral values results in truncation, not rounding.
    }
}
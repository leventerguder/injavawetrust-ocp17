package chapter03.creating_decision_making_statements;

public class PatternMatchingFlowScoping3 {


    public static void main(String[] args) {

        printOnlyIntegers(100L);
        printOnlyIntegersV2(100L);
        printOnlyIntegersV3(100L);

        printOnlyIntegers(100);
        printOnlyIntegersV2(100);
        printOnlyIntegersV3(100);
    }
    /*

    It might surprise you to learn this code does compile. Eek! What is going on here?
    The method returns if the input does not inherit Integer.
    This means that when the last line of the method is reached, the input must inherit Integer,
    and therefore data stays in scope even after the if statement ends.
     */
    static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

    // Flow Scoping and else Branches

    static void printOnlyIntegersV2(Number number) {
        if (!(number instanceof Integer data))
            //System.out.println(data);// DOES NOT COMPILE
            return;
        else
            System.out.println(data.intValue());
    }

    static void printOnlyIntegersV3(Number number) {
        if (number instanceof Integer data)
            System.out.println(data.intValue());
        else
            return;
    }

    // In particular, it is possible to use a pattern variable outside of the if statement,
    // but only when the compiler can definitively determine its type.

}

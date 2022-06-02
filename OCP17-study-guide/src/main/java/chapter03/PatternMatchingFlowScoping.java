package chapter03;

public class PatternMatchingFlowScoping {


    static void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.println(data);
    }

    /*
    If the input does not inherit Integer, the data variable is undefined.
    Since the compiler cannot guarantee that data is an instance of Integer,
    data is not in scope, and the code does not compile.
     */
    void printIntegersOrNumbersGreaterThan5(Number number) {
        //    if (number instanceof Integer data || data.compareTo(5) > 0) // DOES NOT COMPILE
        //        System.out.print(data);
    }

    // Since the input might not have inherited Integer, data is no longer in scope after the if statement.
    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //   System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    /*

    It might surprise you to learn this code does compile. Eek! What is going on here?
    The method returns if the input does not inherit Integer.
    This means that when the last line of the method is reached, the input must inherit Integer,
    and therefore data stays in scope even after the if statement ends.
     */
    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }

    void printOnlyIntegersV2(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
            System.out.print(data.intValue());
    }

    void printOnlyIntegersV3(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        else
            return;
    }

    // In particular, it is possible to use a pattern variable outside of the if statement,
    // but only when the compiler can definitively determine its type.

}

package chapter03.creating_decision_making_statements;

public class PatternMatchingFlowScoping2 {


    // Since the input might not have inherited Integer, data is no longer in scope after the if statement.
    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //   System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printIntegerTwice2(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.intValue());
        }
        //   System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printIntegerTwice3(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.intValue());
            System.out.print(data.intValue());
        }

    }

}

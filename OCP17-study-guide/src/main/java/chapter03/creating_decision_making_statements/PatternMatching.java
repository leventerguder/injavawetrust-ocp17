package chapter03.creating_decision_making_statements;

public class PatternMatching {

    void compareIntegersV1(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.print(data.compareTo(5));
        }
    }

    // Shorter syntax
    void compareIntegersV2(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.compareTo(5));
        }
        // The variable "data" in this example is referred to as the pattern variable.
    }
}

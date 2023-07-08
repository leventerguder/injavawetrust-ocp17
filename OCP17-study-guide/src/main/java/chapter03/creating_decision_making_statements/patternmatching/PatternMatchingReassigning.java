package chapter03.creating_decision_making_statements.patternmatching;

public class PatternMatchingReassigning {

    public static void main(String[] args) {

        reassignV1(20);
        reassignV2(20);
    }
    static void reassignV1(Number number) {
        if (number instanceof Integer data) {
            data = 10;
            System.out.println(data);
        }
    }

    static void reassignV2(Number number) {
        if (number instanceof final Integer data) {
            // data = 10; // DOES NOT COMPILE
            System.out.println(data);
        }
    }
    // The reassignment can be prevented with a final modifier, but it is better not to reassign the variable at all.
}

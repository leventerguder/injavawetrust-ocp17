package chapter03.creating_decision_making_statements;

public class ReassigningPatternVariables {

    void reassignV1(Number number) {
        if (number instanceof Integer data) {
            data = 10;
        }
    }

    void reassignV2(Number number) {
        if (number instanceof final Integer data) {
            // data = 10; // DOES NOT COMPILE
        }
    }
    // The reassignment can be prevented with a final modifier, but it is better not to reassign the variable at all.
}

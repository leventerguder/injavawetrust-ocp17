package chapter03.creating_decision_making_statements;

import java.util.List;

public class LimitationOfSubTypeEnforcement {

    public static void main(String[] args) {

        // For example, given the non-final class Number and interface List, this does compile even though they are unrelated:
        Number value = 123;
        if (value instanceof List) {
        }
        if (value instanceof List data) {
        }
    }
}

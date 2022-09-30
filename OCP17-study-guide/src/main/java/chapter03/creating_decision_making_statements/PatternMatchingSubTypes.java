package chapter03.creating_decision_making_statements;

public class PatternMatchingSubTypes {

    public static void main(String[] args) {

        Integer value = 123;
        if (value instanceof Integer) {
        }

//        if (value instanceof Integer data) {
//        } // DOES NOT COMPILE


        /*
            The type of the pattern variable must be a subtype of the variable
            on the left side of the expression. It also cannot be the same type.
         */


        Number value2 = 123;
        if (value2 instanceof Integer data) {

        }
    }
}

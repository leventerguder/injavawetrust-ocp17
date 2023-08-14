package chapter08.working_with_variables_in_lambdas;

import java.util.function.BinaryOperator;

public class UsingLocalVariablesInsideALambdaBody {

    public static void main(String[] args) {

    }

    private static void localVariables() {
        BinaryOperator<Integer> bo = (a, b) -> {
            int c = 0;
            return 5;
        };

        bo.apply(1, 2);

        BinaryOperator<Integer> bo2 = (a, b) -> {
            //int a = 0; // DOES NOT COMPILE
            // We tried to redeclare a, which is not allowed.
            return 5;
        };

        bo2.apply(1, 2);
    }

    public void variables(int a) {
        int b = 1;
//        Predicate<Integer> p1 = a -> {
//            int b = 0;
//            int c = 0;
//            return b == c;
//        }
    }

    /*
    There are three syntax errors.
    - The variable a was already used in this scope as a method parameter, so it cannot be reused.
    - The code attempts to redeclare local variable b.
    - The variable p1 is missing a semicolon at the end. There is a semicolon before the }, but that is inside the block.
     */
}

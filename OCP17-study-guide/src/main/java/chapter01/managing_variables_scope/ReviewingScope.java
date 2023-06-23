package chapter01.managing_variables_scope;

public class ReviewingScope {

    private String instanceVariable = "best object value";

    private static String classVariable = "cool class";

    private void method(int methodParameter) {

        int localVariableX = 100;

        var localVariableY = 200;

        if (methodParameter > 10) {
            int localVariableInTheIfBlock = 30;
            System.out.println(localVariableInTheIfBlock);
            System.out.println(localVariableX);
            System.out.println(localVariableY);
            System.out.println(methodParameter);
            System.out.println(instanceVariable);
            System.out.println(classVariable);
        } else {
            int localVariableInTheElseBlock = 50;
            System.out.println(localVariableX);
            System.out.println(localVariableY);
            //System.out.println(localVariableInTheIfBlock); //DOES NOT COMPILE
            System.out.println(methodParameter);
            System.out.println(instanceVariable);
            System.out.println(ReviewingScope.classVariable);
        }

        // System.out.println(localVariableInTheIfBlock); //DOES NOT COMPILE

        System.out.println(instanceVariable);
        System.out.println(classVariable);
    }
}

package chapter01.initializing_variables;

public class VarExamples {

    // Since question and answer are not assigned values on the lines where they are defined,
    // the compiler does not know what to make of them

//    public void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
//
//        var answer;
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//
//        System.out.println(answer);
//    }

//    public void twoTypes() {
//        int a, var b = 3; // DOES NOT COMPILE // We couldn’t write int a, int v = 3; either.
//        var n = null; // DOES NOT COMPILE
//    }


    // In this example, a and b are method parameters.
    // Remember that var is only used for local variable type inference!
//    public int addition(var a, var b) { // DOES NOT COMPILE
//        return a + b;
//    }

}

package chapter01;

public class VarInferringType {

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    //  You can only use this feature for local variables.
    // var tricky = "Hello"; // DOES NOT COMPILE


    /*
    When you type var, you are instructing the compiler to determine the type for you.
    The compiler looks at the code on the line of the declaration and uses it to infer the type.
     */
    public void reassignment() {
        var number = 7;
        number = 4;
        // number = "five"; // DOES NOT COMPILE
        //This is not allowed. It is equivalent to typing this:
        //int number = "five";
    }


    //  You could insert a line break between the variable name and its initialization value,
    public void breakingDeclaration() {
        var silly
                = 1;
    }

}

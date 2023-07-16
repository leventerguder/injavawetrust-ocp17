package chapter04.understanding_equality;

public class UnderstandingEquality3 {

    public static void main(String[] args) {

        var name = "a";
        var builder = new StringBuilder("a");
        //System.out.println(name == builder); // DOES NOT COMPILE
        System.out.println(name.equals(builder)); // false

        /*
        Remember that == is checking for object reference equality.
        The compiler is smart enough to know that two references can’t possibly point to the same object
        when they are completely different types.
         */
    }
}

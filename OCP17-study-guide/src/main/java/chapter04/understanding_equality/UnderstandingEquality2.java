package chapter04.understanding_equality;

public class UnderstandingEquality2 {

    public static void main(String[] args) {

        /*
        This works because the authors of the String class implemented a standard method called equals()
        to check the values inside the String rather than the string reference itself.
         */

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); // true
    }
}

package chapter04;

public class ArrayWithReferenceVariables {

    public static void main(String[] args) {

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@4617c264

        /*
        We can call equals() because an array is an object. It returns true because of reference equality.
        The equals() method on arrays does not look at the elements of the array.
         */
    }
}

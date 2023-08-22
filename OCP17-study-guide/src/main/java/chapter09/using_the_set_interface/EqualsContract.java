package chapter09.using_the_set_interface;

public class EqualsContract {

    public static void main(String[] args) {

        Company x = new Company(1, "company-name", "Turkey");

        // Reflexive
        // For any reference value x , x.equals(x) should return true

        System.out.println(x.equals(x));

        // Symmetric
        // For any reference values x and y, x.equals(y)
        // should return true if and only if y.equals(x) returns true.

        Company y = new Company(1, "company-name", "Turkey");

        System.out.println(x.equals(y));
        System.out.println(y.equals(x));

        // Transitive.
        // For any reference values x, y, and z, if x.equals(y) returns true
        // and y.equals(z) returns true,
        // then x.equals(z) must return true.

        Company z = new Company(1, "company-name", "Turkey");

        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));

        // Consistent
        // For any reference values x and y, multiple invocations of x.equals(y) consistently return true
        // or consistently return false,
        // provided no information used in equals comparisons on the object is modified.

        // For any non-null reference value x, x.equals(null) should return false

        System.out.println(x.equals(null));
    }
}

package chapter09.using_the_set_interface;

public class HashCodeContract {

    public static void main(String[] args) {

        // Condition                    Required                            Not Required
        // x.equals(y) == true          --> x.hashCode() == y.hashCode()
        // x.hashCode() == y.hashCode()                                     x.equals(y) == true
        // x.equals(y) == false                                             No hashCode() requirements
        // x.hashCode() != y.hashCode() x.equals(y) == false

        // If two objects are equal according to the equals(Object) method,
        // then calling the hashCode() method on each of the two objects must produce the same integer result.

        Company x = new Company(1, "company-name", "Turkey");
        Company y = new Company(1, "company-name", "Turkey");

        System.out.println(x.equals(y));
        System.out.println(x.hashCode() == y.hashCode());

        // It is NOT required that if two objects are unequal according to the equals(java.lang.Object) method,
        // then calling the hashCode() method on each of the two objects must produce distinct integer results.
        // However, the programmer should be aware that producing distinct integer results for unequal objects may
        // improve the performance of hashtables.


        Company z = new Company(2, "company-name-2", "Turkey");

        System.out.println(x.equals(z));
        System.out.println(x.hashCode() == z.hashCode());
    }
}

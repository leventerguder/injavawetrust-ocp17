package chapter04.creating_and_manipulating_strings;

public class OverridingToString {

    public static void main(String[] args) {

        Person person1 = new Person("john", "doe", 20, 'M');
        Person person2 = new Person("jane", "doe", 25, 'F');

        System.out.println(person1);
        System.out.println(person2);

        Department department1 = new Department(100, "IT");
        Department department2 = new Department(200, "HR");

        System.out.println(department1);
        System.out.println(department2);

    }
//   java.lang.Object format ;

//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
}

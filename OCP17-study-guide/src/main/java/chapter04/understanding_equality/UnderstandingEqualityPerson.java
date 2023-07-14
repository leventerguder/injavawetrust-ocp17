package chapter04.understanding_equality;

public class UnderstandingEqualityPerson {

    public static void main(String[] args) {

        Person person1 = new Person(1, "john", "doe");
        Person person2 = new Person(1, "john", "doe");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}

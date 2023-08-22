package chapter09.using_the_set_interface;

import java.util.HashSet;

public class SetPersonExample {

    public static void main(String[] args) {

        Person person1 = new Person(1, "ahmet", "yilmaz", 25);
        Person person2 = new Person(1, "ahmet", "yilmaz", 25);
        Person person3 = new Person(1, "ahmet", "yilmaz", 25);

        System.out.println("person1 == person1 : " + (person1 == person1)); // true
        System.out.println("person1 == person2 : " + (person1 == person2)); // false
        System.out.println("person1 == person3 : " + (person1 == person3)); // false
        System.out.println("person1.equals(person2) : " + person1.equals(person2)); // false


        HashSet<Person> personsSet = new HashSet<>();

        System.out.println(personsSet.add(person1)); // true
        System.out.println(personsSet.add(person2)); // true
        System.out.println(personsSet.add(person3)); // true
        System.out.println(personsSet.add(person1)); // false
        System.out.println(personsSet.add(person1)); // false
        System.out.println(personsSet.add(new Person(1, "ahmet", "yilmaz", 25))); // true

        System.out.println("personsSet.size() : " + personsSet.size()); //4
        System.out.println(personsSet);

        System.out.println(personsSet.remove(new Person(1, "ahmet", "yilmaz", 25))); //false
        System.out.println(personsSet.remove(person1)); // true
        System.out.println(personsSet.remove(person2)); // true

        System.out.println(personsSet.size()); //2
        System.out.println(personsSet);


    }
}

package chapter01.understanding_data_types;

public class UsingReferenceTypes {

    public static void main(String[] args) {

        String greeting = new String("How are you?");

        String anotherObject = "anotherObject";

        greeting = anotherObject;

        System.out.println(greeting);

    }
}

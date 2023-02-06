package chapter06.declaring_constructors.v2;

public class ConstructorTest1 {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        System.out.println(gorilla.getAge());
        System.out.println(gorilla.getName());

        System.out.println();

        Gorilla gorilla2 = new Gorilla(10);
        System.out.println(gorilla2.getAge());
        System.out.println(gorilla2.getName());
    }
}

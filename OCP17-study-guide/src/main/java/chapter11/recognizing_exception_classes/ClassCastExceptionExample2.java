package chapter11.recognizing_exception_classes;

public class ClassCastExceptionExample2 {

    static class Animal {

    }

    static class Dog extends Animal {

    }

    static class Cat extends Animal {

    }

    public static void main(String[] args) {

        Animal animal = new Dog();

        Cat cat = (Cat) animal; // java.lang.ClassCastException
    }
}

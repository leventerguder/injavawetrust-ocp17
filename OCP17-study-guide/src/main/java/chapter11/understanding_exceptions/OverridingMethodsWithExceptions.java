package chapter11.understanding_exceptions;

public class OverridingMethodsWithExceptions {
}

class Animal {

    void eat() {
    }
}

class Dog extends Animal {
    void eat() throws RuntimeException {
    }

}
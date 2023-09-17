package chapter11.understanding_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingMethodsWithExceptions {
}

class Animal {

    void eat() {
    }

    void run() throws IOException {

    }
}

class Dog extends Animal {
    void eat() throws RuntimeException {
    }

    void run() throws FileNotFoundException {

    }
}
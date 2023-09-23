package chapter11.questions.q11;

public class Q11 {

    class Apple extends RuntimeException {
    }

    class Orange extends Exception {
    }

    class Banana extends Error {
    }

    class Pear extends Apple {
    }

    class Tomato extends Orange {
    }

    class Peach extends Throwable {
    }
}

// Which of the following exceptions must be handled or declared in the method
// in which they are thrown?

// Orange
// Tomato
// Peach
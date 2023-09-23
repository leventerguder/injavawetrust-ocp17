package chapter11.questions.q01;

import java.io.IOException;

public class Q01 {

    public void whatHappensNextOptionA() throws IOException {
        System.out.println("it's ok");
    }

    public void whatHappensNextOptionB() throws IOException {
        // throw new Exception(); // DOES NOT COMPILE
    }

    public void whatHappensNextOptionC() throws IOException {
        throw new IllegalArgumentException();
    }

    public void whatHappensNextOptionD() throws IOException {
        throw new java.io.IOException();
    }

    public void whatHappensNextOptionE() throws IOException {
        throw new RuntimeException();
    }
}

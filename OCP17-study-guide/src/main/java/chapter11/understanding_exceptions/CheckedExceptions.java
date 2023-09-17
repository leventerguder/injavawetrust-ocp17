package chapter11.understanding_exceptions;

import java.io.IOException;

public class CheckedExceptions {

    void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    void fallHandle(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

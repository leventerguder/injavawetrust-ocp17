package chapter11.handling_exceptions;

public class UsingTryAndCatchStatements {

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
    }

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("getUp!!!");
    }
}

package chapter11.handling_exceptions;

public class UsingTryAndCatchStatements {

    public static void main(String[] args) {

        var ref = new UsingTryAndCatchStatements();
        ref.explore();
    }

    void explore() {
        try {
            System.out.println("before fall() method...");
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            System.out.println("before getUp() method...");
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

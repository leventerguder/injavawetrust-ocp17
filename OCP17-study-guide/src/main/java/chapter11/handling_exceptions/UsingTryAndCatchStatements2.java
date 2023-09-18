package chapter11.handling_exceptions;

public class UsingTryAndCatchStatements2 {

//    void explore() {
//        try // DOES NOT COMPILE
//            fall();
//        catch(Exception e)
//        System.out.println("get up");
//    }

//    void explore2() {
//        try { // DOES NOT COMPILE
//            fall();
//        }
//    }

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("getUp!!!");
    }
}

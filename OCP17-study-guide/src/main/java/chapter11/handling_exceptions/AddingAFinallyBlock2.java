package chapter11.handling_exceptions;

public class AddingAFinallyBlock2 {

    void explore() {

//        try {
//            fall();
//        } finally {
//            System.out.println("all better");
//        } catch(Exception e){ // DOES NOT COMPILE
//            System.out.println("get up");
//        }

        try {
            fall();
        } finally {
            System.out.println("all better");
        }
    }

    private void fall() {
        throw new RuntimeException();
    }
}

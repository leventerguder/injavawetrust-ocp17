package chapter11.handling_exceptions;

public class ChainingCatchBlocks2 {

    public void visitSnakes() {
        try {
        } catch (IllegalArgumentException e) {
        }
        //} catch (NumberFormatException e) { // DOES NOT COMPILE }

        // NumberFormatException is a subclass of IllegalArgumentException

    }

    public void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
            //  System.out.println(e1); // DOES NOT COMPILE
        }
        //  remember that an exception defined by the catch statement
        //  is only in scope for that catch block!
    }

}

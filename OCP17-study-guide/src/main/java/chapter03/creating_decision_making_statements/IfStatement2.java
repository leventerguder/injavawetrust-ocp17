package chapter03.creating_decision_making_statements;

public class IfStatement2 {

    public static void main(String[] args) {


        boolean active = isActive();

        if (active) {
            System.out.println("Executing...");
        }

        if(!active) {
            
        }

        if (active == true) { // Not good approach.
            System.out.println("Executing2...");
        }

        if (active = false) { // Assignment Operator!
            System.out.println("Executing3...");
        }

        System.out.println(active);
    }

    private static boolean isActive() {
        //
        //
        return true;
    }
}

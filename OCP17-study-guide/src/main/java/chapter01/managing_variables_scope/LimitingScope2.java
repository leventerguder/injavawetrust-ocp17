package chapter01.managing_variables_scope;

public class LimitingScope2 {

    public static void main(String[] args) {

        int localVariable = 10;

        if (args != null) {
            // int localVariable = 10; // DOES NOT COMPILE
            // Variable 'localVariable' is already defined in the scope

            int size = 10;
        }

        // System.out.println(size); // DOES NOT COMPILE
        int size = 30;

        System.out.println(size);
    }
}

package chapter01.managing_variables_scope;

public class LimitingScope2 {

    public static void main(String[] args) {

        int localVariable = 10;

        if (args != null) {
            // int localVariable = 10; // DOES NOT COMPILE
            // Variable 'localVariable' is already defined in the scope
        }
    }
}

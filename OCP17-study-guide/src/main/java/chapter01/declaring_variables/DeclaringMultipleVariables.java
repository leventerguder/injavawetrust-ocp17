package chapter01.declaring_variables;

public class DeclaringMultipleVariables {

    // You can declare many variables in the same declaration as long as they are all of the same type.
    // You can declare many variables in the same declaration as long as they are all of the same type.
    void sandFence() {
        String s1, s2;
        String s3 = "yes", s4 = "no";
    }

    // Three variables were declared: i1, i2, and i3. However, only one of those values was initialized: i3.
    void paintFence() {
        int i1, i2, i3 = 0;
    }


    // This code doesn’t compile because it tries to declare multiple variables of different types in the same statement.
    // int num, String value; // DOES NOT COMPILE

    boolean b1, b2;
    String s1 = "1", s2;

    // If you want to declare multiple variables in the same statement, they must share the same type declaration and not repeat it.
    // double d1, double d2;  //Illegal
    int i1;int i2;
    // int i3; i4; // Illegal. We have two completely different statements on the same line.

}

package chapter02.applying_unary_operators;

public class NegationOperator {

    public static void main(String[] args) {

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21


        /*
        You cannot apply a negation operator (-) to a boolean expression,
        nor can you apply a logical complement operator (!) to a numeric expression
         */
        // int pelican = !5; // DOES NOT COMPILE
        // boolean penguin = -true; // DOES NOT COMPILE
        // boolean peacock = !0; // DOES NOT COMPILE
    }
}

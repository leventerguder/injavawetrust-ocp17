package chapter02.comparing_values;

public class InstanceOfOperator3 {

    public static void main(String[] args) {

        System.out.println(null instanceof Object); // false
        Object noObjectHere = null;
        System.out.println(noObjectHere instanceof String); // false

        // System.out.print(null instanceof null); // DOES NOT COMPILE
    }
}

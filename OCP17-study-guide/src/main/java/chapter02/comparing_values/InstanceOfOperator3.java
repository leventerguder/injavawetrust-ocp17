package chapter02.comparing_values;

public class InstanceOfOperator3 {


    public static void main(String[] args) {

        openZoo(10);
        openZoo(10.0);
        openZoo(0.5);
        openZoo2(20);
    }

    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.println((Integer) time + " O'clock" + " className : " + time.getClass());
        else
            System.out.println(time + " className : " + time.getClass());
    }

    // If the compiler can determine that a variable cannot possibly be cast to a specific class, it reports an error.
    public static void openZoo2(Number time) {
        // if (time instanceof String) // DOES NOT COMPILE
        System.out.println(time);
    }

}

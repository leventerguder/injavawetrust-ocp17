package chapter02.comparing_values;

public class InstanceOfOperator {

    public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer) time + " O'clock");
        else
            System.out.print(time);
    }

    // If the compiler can determine that a variable cannot possibly be cast to a specific class, it reports an error.
    public void openZoo2(Number time) {
        //if (time instanceof String) // DOES NOT COMPILE
        System.out.print(time);
    }

    public void nullInstanceOff() {
        System.out.print(null instanceof Object); // false
        Object noObjectHere = null;
        System.out.print(noObjectHere instanceof String); // false

        // System.out.print(null instanceof null); // DOES NOT COMPILE
    }
}

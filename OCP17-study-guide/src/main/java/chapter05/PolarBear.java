package chapter05;

public class PolarBear {

    //   The compiler does not apply a default value to final variables, though.
    //   A final instance or final static variable must receive a value when it is declared or as part of initialization.

    final int age = 10;
    final int fishEaten;
    final String name;

    {
        fishEaten = 10;
    }

    public PolarBear() {
        name = "Robert";
    }
}

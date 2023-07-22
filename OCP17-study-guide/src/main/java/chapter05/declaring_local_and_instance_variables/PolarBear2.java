package chapter05.declaring_local_and_instance_variables;

public class PolarBear2 {

    //   The compiler does not apply a default value to final variables, though.
    //   A final instance or final static variable must receive a value when it is declared or as part of initialization.

    final int age;
    final int fishEaten;
    final String name;

    public PolarBear2() {
        this(1, 5);
    }

    public PolarBear2(int age, int fishEaten) {
        this.age = age;
        this.fishEaten = fishEaten;
        name = "default";
    }

    public PolarBear2(int age, int fishEaten, String name) {
        this.age = age;
        this.fishEaten = fishEaten;
        this.name = name;
    }
}

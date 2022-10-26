package chapter05.accessing_static_data;

public class MantaRay {

    private String name = "Sammy";

    public static void first() {
        // The compiler will give you an error about making a static reference to an instance field.
        // System.out.print(name); // DOES NOT COMPILE
    }

    public static void second() {
    }

    public void third() {
        System.out.print(name);
    }

    public static void main(String[] args) {
        first();
        second();

        // The compiler will give you an error about making a static reference to an instance method.
        // third(); // DOES NOT COMPILE

        var ray = new MantaRay();
        ray.third();
    }
}

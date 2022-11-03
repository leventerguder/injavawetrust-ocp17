package chapter05.passing_data_among_methods;

public class Dog {

    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.print(name);
    }

    public static void speak(String name) {
        name = "Georgette";
        // The correct answer is Webby. Just as in the primitive example, the variable assignment is only to the method parameter and doesn’t affect the caller.
    }
}

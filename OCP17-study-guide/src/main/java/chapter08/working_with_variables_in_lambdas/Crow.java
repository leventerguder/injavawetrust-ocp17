package chapter08.working_with_variables_in_lambdas;

import java.util.function.Consumer;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }
}

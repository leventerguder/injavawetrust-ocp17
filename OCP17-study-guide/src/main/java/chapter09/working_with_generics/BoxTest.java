package chapter09.working_with_generics;

public class BoxTest {

    public static void main(String[] args) {

        Box.<String>ship("package");
        Box.<String[]>ship(args);

        Box.ship("package");
        Box.ship(args);

    }
}

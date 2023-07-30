package chapter07.working_with_enums;

public class ColorsTest {

    public static void main(String[] args) {

        // Enum types cannot be instantiated
        // Colors color = new Colors(10); // DOES NOT COMPILE

        System.out.println("before enum...");
        Colors color = Colors.BLUE;
        System.out.println("after enum...");
        System.out.println(color);
    }
}

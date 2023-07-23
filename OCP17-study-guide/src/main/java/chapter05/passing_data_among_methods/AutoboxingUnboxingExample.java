package chapter05.passing_data_among_methods;

public class AutoboxingUnboxingExample {

    void method1() {
        int quack = 5;
        Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
        int quackquackquack = quackquack.intValue(); // Convert Integer to int
    }

    void method2() {
        int quack = 5;
        Integer quackquack = quack; // Autoboxing
        int quackquackquack = quackquack; // Unboxing
    }

    void method3() {
        Short tail = 8; // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p; // Unboxing
        Boolean nose = true; // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e; // Unboxing, then implicit casting

        // Integer f = ears; // DOES NOT COMPILE
        Long g = ears;
    }

    void method4() {
        // Long badGorilla = 8; // DOES NOT COMPILE
        // Java will automatically cast or autobox the int value to long or Integer, respectively.
        // Neither of these types can be assigned to a Long reference variable, though, so the code does not compile.
    }

    void method5() {
        Character elephant = null;
        char badElephant = elephant; // NullPointerException
    }
}

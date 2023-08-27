package chapter09.working_with_generics;

public class TrickyCrateTest {

    public static void main(String[] args) {
        invokeTricky();
        invokeTricky2();
    }

    public static String invokeTricky() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }

    public static void invokeTricky2() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        // crate.tricky2("bot");// DOES NOT COMPILE
        crate.tricky2(new Robot());
    }

    public static void invokeTricky3() {
        TrickyCrate<StringBuilder> crate = new TrickyCrate<>();
        crate.tricky3("bot");
        crate.tricky3(100);
    }
}

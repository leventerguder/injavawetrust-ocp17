package chapter08.coding_functional_interfaces;

@FunctionalInterface
public interface Climb {
    void reach();

    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}

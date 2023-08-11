package chapter08.coding_functional_interfaces;

// @FunctionalInterface // DOES NOT COMPILE
public interface Sleep {
    private void snore() {
    }

    default int geZzz() {
        return 1;
    }
}

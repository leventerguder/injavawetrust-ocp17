package chapter08.coding_functional_interfaces;

// @FunctionalInterface // DOES NOT COMPILE

public interface Soar {

    @Override
    abstract String toString();

    // Is the Soar class a functional interface?
    // It is not. Since toString() is a public method implemented in Object,
    // it does not count toward the single abstract method test.

}

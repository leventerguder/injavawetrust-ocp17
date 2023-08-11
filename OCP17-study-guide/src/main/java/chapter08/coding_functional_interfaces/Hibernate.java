package chapter08.coding_functional_interfaces;

// @FunctionalInterface // DOES NOT COMPILE

public interface Hibernate {
    @Override
    String toString();

    // the Hibernate interface uses equals(Hibernate) instead of equals(Object)
    // @Override // DOES NOT COMPILE
    public boolean equals(Hibernate o);

    @Override
    public abstract int hashCode();

    public void rest();
}
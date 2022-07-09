package chapter08.codingfunctionalinterfaces;

// @FunctionalInterface // DOES NOT COMPILE

public interface Hibernate {
    String toString();

    // the Hibernate interface uses equals(Hibernate) instead of equals(Object)
    public boolean equals(Hibernate o);

    public abstract int hashCode();

    public void rest();
}
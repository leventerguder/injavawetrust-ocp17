package chapter08.coding_functional_interfaces;

@FunctionalInterface
// The dive() method is the single abstract method,
// while the others are not counted since they are public methods defined in the Object class.
public interface Dive {

    @Override
    String toString();

    @Override
    public boolean equals(Object o);

    @Override
    public abstract int hashCode();

    public void dive();

}
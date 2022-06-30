package chapter07.implementinginterfaces;

// The following two interface definitions are equivalent, as the compiler will convert them both to the second declaration:
public interface Soar {

    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;

    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();

}
/**
public abstract interface Soar {
    public static final int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;

    public abstract void fly(int speed);

    public abstract void takeoff();

    public abstract double dive();
}
 **/
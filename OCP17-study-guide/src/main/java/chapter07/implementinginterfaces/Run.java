package chapter07.implementinginterfaces;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
package chapter07.implementinginterfaces;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
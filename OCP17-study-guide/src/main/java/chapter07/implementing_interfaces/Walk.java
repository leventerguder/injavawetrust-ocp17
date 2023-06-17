package chapter07.implementing_interfaces;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
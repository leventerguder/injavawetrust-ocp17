package chapter07.implementing_interfaces;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
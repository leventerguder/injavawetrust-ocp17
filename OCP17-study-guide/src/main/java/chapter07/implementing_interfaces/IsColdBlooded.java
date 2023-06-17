package chapter07.implementing_interfaces;

public interface IsColdBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}
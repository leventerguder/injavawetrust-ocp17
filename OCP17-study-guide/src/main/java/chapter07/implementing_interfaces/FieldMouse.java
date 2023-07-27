package chapter07.implementing_interfaces;

public class FieldMouse implements Climb, CanBurrow {
    @Override
    public Float getSpeed(int age) {
        return 11f;
    }
}

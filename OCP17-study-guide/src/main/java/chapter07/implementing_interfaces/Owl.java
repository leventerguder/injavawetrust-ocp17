package chapter07.implementing_interfaces;

public class Owl implements HasBigEyes {

    @Override
    public int hunt() {
        return 5;
    }

    @Override
    public void flap() {
        System.out.println("Flap!");
    }
}

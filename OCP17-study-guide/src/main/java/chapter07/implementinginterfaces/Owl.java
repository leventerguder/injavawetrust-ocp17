package chapter07.implementinginterfaces;

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

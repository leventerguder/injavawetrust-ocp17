package chapter07.implementinginterfaces;

public class Snake implements IsColdBlooded {
    public boolean hasScales() { // Required override
        return true;
    }

    public double getTemperature() { // Optional override
        return 12;
    }


    public static void main(String[] args) {
        Snake s = new Snake();
        System.out.println(s.hasScales());
        System.out.println(s.getTemperature());

    }
}

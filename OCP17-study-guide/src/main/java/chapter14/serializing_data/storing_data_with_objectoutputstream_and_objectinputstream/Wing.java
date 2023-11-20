package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

public class Wing {

    private int power;

    public Wing(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "power=" + power +
                '}';
    }
}

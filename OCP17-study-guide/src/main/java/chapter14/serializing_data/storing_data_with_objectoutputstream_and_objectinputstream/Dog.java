package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.Serializable;

public class Dog implements Serializable {
    private Collar collar;
    private int dogSize;

    public Dog(Collar collar, int dogSize) {
        this.collar = collar;
        this.dogSize = dogSize;
    }

    public Collar getCollar() {
        return collar;
    }

    public int getDogSize() {
        return dogSize;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collar=" + collar +
                ", dogSize=" + dogSize +
                '}';
    }
}

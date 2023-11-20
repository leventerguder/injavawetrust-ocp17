package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.Serializable;

public class Collar implements Serializable {
    private int collarSize;

    public Collar(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getCollarSize() {
        return collarSize;
    }

    @Override
    public String toString() {
        return "Collar{" +
                "collarSize=" + collarSize +
                '}';
    }
}

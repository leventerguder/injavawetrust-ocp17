package chapter14.serializing_data.understanding_the_deserialization_creation_process;

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

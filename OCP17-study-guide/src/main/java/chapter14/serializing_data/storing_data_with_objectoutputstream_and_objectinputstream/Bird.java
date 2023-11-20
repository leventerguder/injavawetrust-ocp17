package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.Serializable;

public class Bird implements Serializable {

    private int size;

    private String type;

    private Wing wing;

    public Bird(int size, String type, Wing wing) {
        this.size = size;
        this.type = type;
        this.wing = wing;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public Wing getWing() {
        return wing;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", wing=" + wing +
                '}';
    }
}

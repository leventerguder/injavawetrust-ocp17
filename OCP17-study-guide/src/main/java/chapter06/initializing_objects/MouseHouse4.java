package chapter06.initializing_objects;

public class MouseHouse4 {
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse4(String type) {
        this.type = type;
    }


    public MouseHouse4() {
        this(null);
    }

}

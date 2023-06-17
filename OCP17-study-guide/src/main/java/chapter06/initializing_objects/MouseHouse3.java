package chapter06.initializing_objects;

public class MouseHouse3 {
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse3(String type) {
        this.type = type;
    }

    /*
    In this example, the first constructor that takes a String argument compiles.
    In terms of assigning values, each constructor is reviewed individually,
    which is why the second constructor does not compile.
     */
//    public MouseHouse3() {
//        this.volume = 2; // DOES NOT COMPILE
//        // Variable 'volume' might already have been assigned to
//    }

}

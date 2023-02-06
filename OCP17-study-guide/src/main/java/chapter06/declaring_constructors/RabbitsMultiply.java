package chapter06.declaring_constructors;

import chapter06.declaring_constructors.Rabbit1;
import chapter06.declaring_constructors.Rabbit2;
import chapter06.declaring_constructors.Rabbit3;

public class RabbitsMultiply {

    public static void main(String[] args) {
        var r1 = new Rabbit1();
        var r2 = new Rabbit2();
        var r3 = new Rabbit3(true);
        //var r4 = new Rabbit4(); // DOES NOT COMPILE
    }
}

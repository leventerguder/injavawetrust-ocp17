package chapter07.encapsulating_data_with_records;

import java.io.Serializable;

public class CraneInstanceofTest {

    public static void main(String[] args) {

        Crane crane = new Crane(1, "crane");

        System.out.println(crane instanceof Crane);
        System.out.println(crane instanceof Object);
        // The record classes extend java.lang.Record
        System.out.println(crane instanceof Record);

    }
}

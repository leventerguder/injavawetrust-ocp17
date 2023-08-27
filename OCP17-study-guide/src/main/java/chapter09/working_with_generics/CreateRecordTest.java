package chapter09.working_with_generics;

import java.util.List;

public class CreateRecordTest {

    public static void main(String[] args) {

        Robot robot = new Robot();
        CrateRecord<Robot> record = new CrateRecord<>(robot);

        CrateRecord<Integer> crateRecord1 = new CrateRecord(100);
        CrateRecord<List<Integer>> crateRecord2 = new CrateRecord(List.of(10, 20));

        System.out.println(record.contents());
        System.out.println(crateRecord1.contents());
        System.out.println(crateRecord2.contents());
    }
}

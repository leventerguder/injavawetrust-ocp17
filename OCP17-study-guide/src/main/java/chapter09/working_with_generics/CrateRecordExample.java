package chapter09.working_with_generics;

public class CrateRecordExample {

    public static void main(String[] args) {
        Robot robot = new Robot();
        CrateRecord<Robot> record = new CrateRecord<>(robot);
    }
}

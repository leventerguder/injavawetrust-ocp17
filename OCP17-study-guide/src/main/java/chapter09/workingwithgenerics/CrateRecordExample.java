package chapter09.workingwithgenerics;

public class CrateRecordExample {

    public static void main(String[] args) {
        Robot robot = new Robot();
        CrateRecord<Robot> record = new CrateRecord<>(robot);
    }
}

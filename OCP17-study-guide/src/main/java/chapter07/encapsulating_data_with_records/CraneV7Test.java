package chapter07.encapsulating_data_with_records;

public class CraneV7Test {

    public static void main(String[] args) {

        CraneV7 crane = new CraneV7(10, "good-crane");
        System.out.println(crane);

        CraneV7 invalidCrane = new CraneV7(-1, "bad-crane");
    }
}

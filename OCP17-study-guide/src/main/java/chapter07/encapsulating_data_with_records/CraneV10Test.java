package chapter07.encapsulating_data_with_records;

public class CraneV10Test {

    public static void main(String[] args) {

        CraneV10 crane1 = new CraneV10(1, "crane-1");

        CraneV10 crane2 = new CraneV10("crane", "family");

        System.out.println(crane1);
        System.out.println(crane2);
    }
}

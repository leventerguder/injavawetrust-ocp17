package chapter07.encapsulating_data_with_records;

public class UnderstandingRecordImmutability {

    public static void main(String[] args) {

        var cousin = new Crane(3, "Jenny");
        var friend = new Crane(cousin.numberEggs(), "Janeice");

        System.out.println(cousin);
        System.out.println(friend);
    }
}

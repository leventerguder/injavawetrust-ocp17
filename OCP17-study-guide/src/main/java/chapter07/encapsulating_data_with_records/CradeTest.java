package chapter07.encapsulating_data_with_records;

public class CradeTest {
    public static void main(String[] args) {

        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        // var mommy1 = new Crane("Cammy", 4); // DOES NOT COMPILE
        // var mommy2 = new Crane("Cammy"); // DOES NOT COMPILE

        var father = new Crane(0, "Craig");
        System.out.println(father); // Crane[numberEggs=0, name=Craig]


        var copy = new Crane(0, "Craig");
        System.out.println(copy); // Crane[numberEggs=0, name=Craig]
        System.out.println(father.equals(copy)); // true
        System.out.println(father.hashCode() + ", " + copy.hashCode()); // 1007, 1007
    }
}

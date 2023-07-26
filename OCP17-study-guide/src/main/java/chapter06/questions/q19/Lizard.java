package chapter06.questions.q19;

class Reptile {
    {
        System.out.print("A");
    }

    public Reptile(int hatch) {
    }

    void layEggs() {
        System.out.print("Reptile");
    }
}

//public class Lizard extends Reptile{
//    static {
//        System.out.print("B");
//    }
//
//    // public Lizard(int hatch) {} // DOES NOT COMPILE
//
//    public final void layEggs() {
//        System.out.print("Lizard");
//    }
//
//    public static void main(String[] args) {
//        var reptile = new Lizard(1);
//        reptile.layEggs();
//    }
//
//}


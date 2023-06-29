package chapter02.assigning_values;

public class ApplyingCasting {


    public static void main(String[] args) {
        int fish = (int) 1.0;
        short bird = (short) 1921222; // Stored as 20678
        int mammal = (int) 9f;
        //long reptile = (long)192301398193810323; // DOES NOT COMPILE
        long reptile = 192301398193810323L;

        System.out.println(fish);
        System.out.println(bird);
        System.out.println(mammal);
        System.out.println(reptile);
    }
}

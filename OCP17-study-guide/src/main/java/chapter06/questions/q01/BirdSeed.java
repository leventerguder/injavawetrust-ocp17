package chapter06.questions.q01;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        this(2);
        call = false;
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        var seed = new BirdSeed();
        System.out.print(seed.numberBags);
    }
}

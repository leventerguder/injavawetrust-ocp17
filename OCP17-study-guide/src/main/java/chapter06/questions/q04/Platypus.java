package chapter06.questions.q04;

public class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }

    public Platypus() {
        super(1); // Need to call super constructor
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}

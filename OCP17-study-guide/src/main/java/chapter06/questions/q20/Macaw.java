package chapter06.questions.q20;

class Bird {
    int feathers = 0;

    Bird(int x) {
        this.feathers = x;
    }

    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) {
        super(y);
    }

    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot {
    public Macaw(int z) {
        super(z);
    }

    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        System.out.print(((Parrot) p.fly()).feathers);
    }
}
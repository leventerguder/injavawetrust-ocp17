package chapter06.questions.q08;

abstract class Bird {
    private final void fly() {
        System.out.print("Bird");
    }

    protected Bird() {
        System.out.print("Wow-");
    }
}

public class Pelican extends Bird {

    public Pelican() {
        System.out.print("Oh-");
    }

    protected void fly() {
        System.out.print("Pelican");
    }

    public static void main(String[] args) {
        var chirp = new Pelican();
        chirp.fly();
    }
}

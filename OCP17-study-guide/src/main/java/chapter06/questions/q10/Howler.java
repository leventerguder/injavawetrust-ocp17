package chapter06.questions.q10;

public class Howler {


    public Howler(long moon) {
        this(3);
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }

    public Wolf() {
        this("");
    }
}
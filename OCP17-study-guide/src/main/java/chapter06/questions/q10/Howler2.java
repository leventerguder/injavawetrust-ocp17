package chapter06.questions.q10;

public class Howler2 {


    public Howler2(long moon) {
        this((short) 1);
    }

    private Howler2(int moon) {
        super();
    }
}

class Wolf2 extends Howler {
    protected Wolf2(String stars) {
        super(2L);
    }

    public Wolf2() {
        this(null);
    }
}
package chapter06.questions.q11;

public class PolarBear {
    StringBuilder value = new StringBuilder("t");

    {
        value.append("a");
    }

    {
        value.append("c");
    }

    private PolarBear() {
        value.append("b");
    }

    public PolarBear(String s) {
        this();
        value.append(s);
    }

    public PolarBear(CharSequence p) {
        value.append(p);
    }

    public static void main(String[] args) {
        Object bear = new PolarBear();
        bear = new PolarBear("f");
        System.out.println(((PolarBear) bear).value);
    }
}
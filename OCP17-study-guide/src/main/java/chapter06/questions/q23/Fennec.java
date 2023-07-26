package chapter06.questions.q23;

class Canine {
    public Canine(boolean t) {
        logger.append("a");
    }

    public Canine() {
        logger.append("q");
    }

    private StringBuilder logger = new StringBuilder();

    protected void print(String v) {
        logger.append(v);
    }

    protected String view() {
        return logger.toString();
    }
}

class Fox extends Canine {
    public Fox(long x) {
        print("p");
    }

    public Fox(String name) {
        this(2);
        print("z");
    }
}

public class Fennec extends Fox {
    public Fennec(int e) {
        super("tails");
        print("j");
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String... unused) {
        System.out.println(new Fennec(1).view()); // qpzj
    }
}

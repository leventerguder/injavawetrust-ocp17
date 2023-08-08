package chapter07.questions.q29;

class Primate {

    protected int age = 2;

    {
        age = 1;
    }

    public Primate() {
        // this().age = 3; // DOES NOT COMPILE
    }

}

public class Orangutan {
    protected int age = 4;

    {
        age = 5;
    }

    public Orangutan() {
        // this().age = 6; // DOES NOT COMPILE
    }

    public static void main(String[] bananas) {
        // final Primate x = (Primate) new Orangutan(); // DOES NOT COMPILE
        // System.out.println(x.age);
    }
}
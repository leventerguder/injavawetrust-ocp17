package chapter01.questions.q07;

public class KitchenSink {

    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.print("""
                "# forks = " + numForks +
                 " # knives = " + numKnives +
                # cups = 0""");
    }

    // The first thing to recognize is that this is a text block and
    // the code inside the """ is just text.
}

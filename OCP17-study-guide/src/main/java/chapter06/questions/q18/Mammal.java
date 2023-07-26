package chapter06.questions.q18;

public class Mammal {
    private void eat() {
    }

    protected static void drink() {
    }

    public Integer dance(String p) {
        return null;
    }
}

class Primate extends Mammal {
    public void eat(String p) {
    }
}

class Monkey extends Primate {
    public static void drink() throws RuntimeException { //Hidden method
    }

    public Number dance(CharSequence p) { //overloaded
        return null;
    }

    // public int eat(String p) {} // DOES NOT COMPILE
}
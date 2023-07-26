package chapter06.questions.q15;

abstract class Nocturnal {
    // boolean isBlind(); // DOES NOT COMPILE
}

public class Owl extends Nocturnal {

    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {

        var nocturnal = (Nocturnal) new Owl();
        // System.out.println(nocturnal.isBlind());
    }
}

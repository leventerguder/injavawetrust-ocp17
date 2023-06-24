package chapter01.questions.q05;

public class Bear {

    private Bear pandaBear;

    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {

        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;
        System.gc();
    }

    // Garbage collection is never guaranteed to run, m
}



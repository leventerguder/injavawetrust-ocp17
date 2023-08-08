package chapter07.questions.q06;

public abstract interface Herbivore {

    int amount = 10;

    public void eatGrass();

    // public abstract int chew() { return 13; } // DOES NOT COMPILE
}

//abstract class IsAPlant extends Herbivore { // DOES NOT COMPILE
//    Object eatGrass(int season) { return null; }
//}
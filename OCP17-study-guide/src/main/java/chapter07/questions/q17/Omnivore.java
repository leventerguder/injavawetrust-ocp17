package chapter07.questions.q17;

public interface Omnivore {
    int amount = 10;
    static boolean gather = true;

    static void eatGrass() {
    }

//    int findMore() { // DOES NOT COMPILE
//        return 2;
//    }

    default float rest() {
        return 2;
    }

//    protected int chew() { // DOES NOT COMPILE
//        return 13;
//    }

    private static void eatLeaves() {
    }
}
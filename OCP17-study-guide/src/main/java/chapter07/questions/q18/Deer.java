package chapter07.questions.q18;

public class Deer {
    enum Food {APPLES, BERRIES, GRASS}

    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }

    public static void main(String[] seasons) {
//        System.out.print(switch (new Diet().getFavorite()) { // DOES NOT COMPILE
//            case APPLES -> "a";
//            case BERRIES -> "b";
//            default -> "c";
//        });
    }
}
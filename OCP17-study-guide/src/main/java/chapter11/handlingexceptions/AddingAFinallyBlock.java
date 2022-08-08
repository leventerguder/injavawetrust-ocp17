package chapter11.handlingexceptions;

public class AddingAFinallyBlock {


    public static void main(String[] args) {
        AddingAFinallyBlock finallyBlock = new AddingAFinallyBlock();
        finallyBlock.explore();
    }

    void explore() {
        try {
            seeAnimas();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    private void goHome() {
        System.out.println("goHome");
    }

    private void seeMoreAnimals() {
        System.out.println("seeMoreAnimals");
    }

    private void getHugFromDaddy() {
        System.out.println("getHugFromDaddy");
    }

    private void fall() {
        throw new RuntimeException();
    }

    private void seeAnimas() {
        System.out.println("seeAnimas");
    }
}

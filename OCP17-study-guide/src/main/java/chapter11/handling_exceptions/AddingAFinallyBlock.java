package chapter11.handling_exceptions;

public class AddingAFinallyBlock {


    public static void main(String[] args) {
        AddingAFinallyBlock finallyBlock = new AddingAFinallyBlock();
        finallyBlock.explore();
    }

    void explore() {
        try {
            seeAnimals();
            fall();
            System.out.println("Not executed!");
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

    private void seeAnimals() {
        System.out.println("seeAnimals");
    }
}

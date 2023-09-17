package chapter11.handling_exceptions;

public class ChainingCatchBlocks {

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // second catch block System.out.print("not today");
        }
    }

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) { // Subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // Superclass exception
            System.out.print("not today");
        }
    }

    public void visitMonkeys2() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
//        catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
//            System.out.print("try back later");
//        }
    }

    public void visitSnakes() {
        try {
        } catch (IllegalArgumentException e) {
        }
        //} catch (NumberFormatException e) { // DOES NOT COMPILE }


    }

    public void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
          //  System.out.println(e1); // DOES NOT COMPILE
        }
    }


    private void seeAnimal() {
    }
}


class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}
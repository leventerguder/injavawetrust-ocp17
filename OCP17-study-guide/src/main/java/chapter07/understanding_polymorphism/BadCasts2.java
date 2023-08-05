package chapter07.understanding_polymorphism;

public class BadCasts2 {
    public static void main(String[] args) {
        Wolf2 wolfy = new Wolf2();
        // Dog2 badWolf = (Dog2) wolfy; // DOES NOT COMPILE , Wolf2 is final.

        // The compiler recognizes that there are no possible subclasses of
        // Wolf2 capable of implementing the Dog2 interface.
    }
}
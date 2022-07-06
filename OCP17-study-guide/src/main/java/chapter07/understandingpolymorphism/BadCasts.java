package chapter07.understandingpolymorphism;

public class BadCasts {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        Dog badWolf = (Dog) wolfy; // ClassCastException
    }
}
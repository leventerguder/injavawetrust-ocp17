package chapter07.understanding_polymorphism;

public class BadCasts {
    public static void main(String[] args) {
        Wolf wolfDog = new WolfDog();
        Dog goodWolf = (Dog)wolfDog;

        Wolf wolfy = new Wolf();
        Dog badWolf = (Dog) wolfy; // ClassCastException
    }
}
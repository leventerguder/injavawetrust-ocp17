package chapter07.understanding_polymorphism;

public class GoodCasting {

    public static void main(String[] args) {
        Wolf wolfDog = new WolfDog();
        Dog goodWolf = (Dog) wolfDog;
    }
}

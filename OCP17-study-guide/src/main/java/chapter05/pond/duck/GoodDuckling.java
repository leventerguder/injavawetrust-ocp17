package chapter05.pond.duck;

public class GoodDuckling {

    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();   // package access is ok
        System.out.print(duck.noise); // package access is ok
    }
}

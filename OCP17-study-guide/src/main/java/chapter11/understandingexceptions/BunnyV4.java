package chapter11.understandingexceptions;

class BunnyV4 extends Hopper {
    // public void hop() throws CanNotHopException {} // DOES NOT COMPILE

    // Java knows hop() isn’t allowed to throw any checked exceptions because the hop() method in the superclass Hopper doesn’t declare any.
}
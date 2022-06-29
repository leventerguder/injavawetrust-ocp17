package chapter06.creatingabstractclasses;

public abstract class Whale {
    // A method cannot be marked as both abstract and private.
    // private abstract void sing(); // DOES NOT COMPILE

    protected abstract void sing();
}
package chapter07.implementinginterfaces;

// In this example, Cat inherits the two default methods for getSpeed(), so which does it use?
// public class Cat implements Walk, Run {} // DOES NOT COMPILE


public class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }

    public int getRunSpeed() {
        // return Run.getSpeed(); //DOES NOT COMPILE
        // return Run.this.getSpeed(); // DOES NOT COMPILE
        return Run.super.getSpeed();
    }

    /*
    This is an area where a default method exhibits properties of both a static and instance method.
    We use the interface name to indicate which method we want to call,
    but we use the super keyword to show that we are following instance inheritance, not class inheritance.
     */

}

package chapter05.applying_access_modifiers.pond.swan; // Different package than Bird

import chapter05.applying_access_modifiers.pond.shore.Bird;

public class Swan extends Bird { // Swan is a subclass of Bird

    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // subclass access to superclass
        System.out.print(other.text);  // subclass access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        //other.floatInWater(); // DOES NOT COMPILE
        // System.out.print(other.text); // DOES NOT COMPILE
    }
    // Looking at it a different way, the protected rules apply under two scenarios:
    // A member is used without referring to a variable. In this case, we are taking advantage of inheritance, and protected access is allowed.
    // A member is used through a variable. In this case, the rules for the reference type of the variable are what matter.
    // If it is a subclass, protected access is allowed.
    // This works for references to the same class or a subclass.
}

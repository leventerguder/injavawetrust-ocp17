package chapter01; // package must be first non-comment

import java.util.*; // import must come after package

public class Meerkat {
    double weight; // fields and methods can go in either order

    public double getWeight() {
        return weight;
    }

    double height; // another field - they don't need to be together
}

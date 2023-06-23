package chapter01.destroying_objects;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; // The "a" object is eligible for GC
        String three = one;
        one = null;

    } //The "b" object is eligible for GC
}

//one --- > [a] object
//two --- > [b] object
//
//one ----> [b] object //one = two; The "a" object is eligible for GC
//two ----> [b] object
//
//one ----> [b] object //one = two;
//two ----> [b] object
//three ----> [b] object
//
//one XXXXX
//two ----> [b] object
//three ----> [b] object



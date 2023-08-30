package chapter09.questions.q07;

import java.util.*;

public class Alpaca {
    public List<String> hairy(List<String> list) {
        return null;
    }
}

// A valid override of a method with generic arguments must have a return type that is covariant,
// with matching generic type parameters.
class A extends Alpaca {

    // public List<String> hairy(List<CharSequence> list) { return null; } // DOES NOT COMPILE
}

class B extends Alpaca {

    // !! Overloaded
    public List<String> hairy(ArrayList<String> list) {
        return null;
    }

    @Override
    public List<String> hairy(List<String> list) {
        return null;
    }

    // https://www.selikoff.net/ocp17/ , page 524
}

class C extends Alpaca {

    // public List<String> hairy(List<Integer> list) { return null; } // DOES NOT COMPILE

}

class D extends Alpaca {
    // public List<CharSequence> hairy(List<String> list) { return null; } // DOES NOT COMPILE
}

class E extends Alpaca {
    // public Object hairy(List<String> list) { return null; } // DOES NOT COMPILE
}

class F extends Alpaca {


    public ArrayList<String> hairy(List<String> list) {
        return null;
    }
}

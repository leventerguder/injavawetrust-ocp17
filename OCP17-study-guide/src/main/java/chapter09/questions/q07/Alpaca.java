package chapter09.questions.q07;

import java.util.*;

public class Alpaca {
    public List<String> hairy(List<String> list) {
        return null;
    }
}

class A extends Alpaca {

    // public List<String> hairy(List<CharSequence> list) { return null; } // DOES NOT COMPILE
}

class B extends Alpaca {

    // @Override // DOES NO COMPILE
    public List<String> hairy(ArrayList<String> list) {
        return null;
    }
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

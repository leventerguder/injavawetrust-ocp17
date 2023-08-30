package chapter09.questions.q14;

public class Q14 {
}

class W {
}

class X extends W {
}

class Y extends X {
}

class Z<Y> {

    // Y is both a class and a type parameter. This means that within the class Z, when we
    //refer to Y, it uses the type parameter

    W w1 = new W();
    W w2 = new X();

    // W w3 = new Y(); // DOES NOT COMPILE

    // Y y1 = new W(); // DOES NOT COMPILE

    // Y y2 = new X(); // DOES NOT COMPILE

    // Y y1 = new Y(); // DOES NOT COMPILE

}
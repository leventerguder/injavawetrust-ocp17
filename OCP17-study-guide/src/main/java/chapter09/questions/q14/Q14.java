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
// INSERT CODE HERE

    W w1 = new W();
    W w2 = new X();

    // W w3 = new Y(); // DOES NOT COMPILE

    // Y y1 = new W(); // DOES NOT COMPILE

    // Y y2 = new X(); // DOES NOT COMPILE

    // Y y1 = new Y(); // DOES NOT COMPILE

}
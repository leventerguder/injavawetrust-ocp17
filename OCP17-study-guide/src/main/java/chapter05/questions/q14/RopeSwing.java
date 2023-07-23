package chapter05.questions.q14;

public class RopeSwing {

    private static final String leftRope;
    private static final String rightRope;
    // private static final String bench; //DOES NOT COMPILE
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
        // name = "name"; //DOES NOT COMPILE
        // rightRope = "right";  //DOES NOT COMPILE
    }

    public static void main(String[] args) {
        // bench = "bench"; //DOES NOT COMPILE
    }

}

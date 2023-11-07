package chapter13.questions.q01;

import java.util.ArrayList;

public class Q01 {


    public static void main(String[] args) {

        var c = new ArrayList<Thread>();
        var s = c.stream();

        var p = c.parallelStream();
        var p2 = s.parallel();
    }
}

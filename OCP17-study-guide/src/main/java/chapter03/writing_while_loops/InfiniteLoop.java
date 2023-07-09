package chapter03.writing_while_loops;

public class    InfiniteLoop {

    public static void main(String[] args) {

        int pen = 2;
        int pigs = 5;
        while (pen < 10)
            pigs++;

        // You may notice one glaring problem with this statement: it will never end.
    }
}

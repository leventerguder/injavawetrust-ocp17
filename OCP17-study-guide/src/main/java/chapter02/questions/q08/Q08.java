package chapter02.questions.q08;

public class Q08 {

    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++;

        // increments pig by 1, but it returns the original value of 4 since it is using
        // the post-increment operator.
        // The pig variable is then assigned this value,
        // and the increment operation is discarded.

        long goat = (int) 2;
        goat -= 1.0;
        //the compound operator applies casting automatically.

        System.out.print(pig + " - " + goat); // 4 - 1
    }
}

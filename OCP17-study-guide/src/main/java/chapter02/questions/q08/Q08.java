package chapter02.questions.q08;

public class Q08 {

    public static void main(String[] args) {
        int pig = (short)4;
        pig = pig++;

        long goat = (int)2;
        goat -= 1.0;

        System.out.print(pig + " - " + goat); // 4 - 1
    }
}

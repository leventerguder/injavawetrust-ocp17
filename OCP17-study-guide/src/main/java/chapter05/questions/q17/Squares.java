package chapter05.questions.q17;

public class Squares {
    public static long square(int x) {
        var y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        var value = 9;
        var result = square(value);
        System.out.println(value);
    }
}
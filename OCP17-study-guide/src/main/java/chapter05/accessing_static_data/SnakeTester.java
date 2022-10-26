package chapter05.accessing_static_data;

public class SnakeTester {

    public static void main(String[] args) {

        System.out.println(Snake.hiss);

        Snake s = new Snake();
        System.out.println(s.hiss);
        s = null;
        System.out.println(s.hiss);
        // Java doesn’t care that s happens to be null.
        // Since we are looking for a static variable, it doesn’t matter.

        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss); // 5
    }
}

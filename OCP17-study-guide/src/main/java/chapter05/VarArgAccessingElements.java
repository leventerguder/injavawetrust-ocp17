package chapter05;

public class VarArgAccessingElements {

    public static void main(String[] args) {
        run(11, 77); // 77
    }

    public static void run(int... steps) {
        System.out.print(steps[1]);
    }
}
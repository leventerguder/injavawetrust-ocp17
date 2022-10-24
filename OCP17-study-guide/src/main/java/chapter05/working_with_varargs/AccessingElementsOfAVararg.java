package chapter05.working_with_varargs;

public class AccessingElementsOfAVararg {

    public static void main(String[] args) {
        run(11, 77); // 77
    }

    public static void run(int... steps) {
        System.out.print(steps[1]);
    }
}
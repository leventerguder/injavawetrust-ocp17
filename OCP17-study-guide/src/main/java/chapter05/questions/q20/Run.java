package chapter05.questions.q20;

public class Run {

    static void execute() {
        System.out.print("1-");
    }

    static void execute(int num) {
        System.out.print("2-");
    }

    static void execute(Integer num) {
        System.out.print("3-");
    }

    static void execute(Object num) {
        System.out.print("4-");
    }

    static void execute(int... nums) {
        System.out.print("5-");
    }

    public static void main(String[] args) {
        Run.execute(100);
        Run.execute(100L);
    }
}

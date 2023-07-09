package chapter03.questions.q20;

public class Q20 {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        int height = 1;
        L1:
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) break L2;
                int temperature = 30;
                L3:
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) continue L2;
                }
            } while (humidity > 4);
        }
    }

    private static void method2() {
        int height = 1;
        L1:
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) continue L2;
                int temperature = 30;
                L3:
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) continue L2;
                }
            } while (humidity > 4);
        }
    }
}

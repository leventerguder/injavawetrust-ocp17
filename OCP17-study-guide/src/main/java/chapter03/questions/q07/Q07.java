package chapter03.questions.q07;

public class Q07 {

    private void printV1(int[] weather) {
        for (int i = 0; i <= weather.length - 1; ++i) {
            System.out.println(weather[i]);
        }
    }

    private void printV2(int[] weather) {
        for (int i = weather.length - 1; i >= 0; i--) {
            System.out.println(weather[i]);
        }
    }
}

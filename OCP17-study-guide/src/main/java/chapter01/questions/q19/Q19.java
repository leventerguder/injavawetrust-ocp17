package chapter01.questions.q19;

public class Q19 {

    public static void main(String[] args) {

        var num1 = Long.parseLong("100");
        var num2 = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));
    }
}

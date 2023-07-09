package chapter03.questions.q02;

public class Q02 {

    public static void main(String[] args) {

        int temperature = 4;
        long humidity = -temperature + temperature * 3;

        if (temperature >= 4)
        if (humidity < 6) System.out.println("Too Low");
        else System.out.println("Just Right");
        else System.out.println("Too High");

        System.out.println(temperature);
        System.out.println(humidity);
    }
}

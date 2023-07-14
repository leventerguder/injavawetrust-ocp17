package chapter04.calculating_with_math_apis;

import java.util.Random;

public class GeneratingRandomNumbers {

    public static void main(String[] args) {

        double num = Math.random();
        System.out.println(num);

        Random random = new Random();
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
    }
}

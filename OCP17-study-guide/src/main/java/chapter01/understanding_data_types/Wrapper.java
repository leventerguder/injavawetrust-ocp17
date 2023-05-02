package chapter01.understanding_data_types;

public class Wrapper {

    public static void main(String[] args) {

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        // Integer nfe = Integer.valueOf("123.5"); // NumberFormatException

        System.out.println(primitive);
        System.out.println(wrapper);

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue()); // -56
        System.out.println(apple.intValue()); //200
        System.out.println(apple.doubleValue()); // 200.99

        // Double nfe2 = Double.valueOf("200,99"); // NumberFormatException

        int max = Integer.max(10, 25);
        int min = Integer.min(50, 265);
        int sum = Integer.sum(60, 20);

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);


    }
}


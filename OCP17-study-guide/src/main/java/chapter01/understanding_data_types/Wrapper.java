package chapter01.understanding_data_types;

public class Wrapper {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue()); // -56
        System.out.println(apple.intValue()); //200
        System.out.println(apple.doubleValue()); // 200.99
    }
}


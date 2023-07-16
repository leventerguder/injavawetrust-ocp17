package chapter04.understanding_arrays;

public class UnderstandingArrays {

    public static void main(String[] args) {

        char[] letters = null;
        char[] letters2 = new char[5];
        char[] letters3 = {'a', 'b', 'c'};

        int length = letters2.length;

        System.out.println(length);

        System.out.println(letters3);
        System.out.println(letters3 instanceof Object);
        System.out.println(letters3.getClass());
        System.out.println(letters3 instanceof char[]);

        int[] numbs = null;
        System.out.println(numbs);

        // System.out.println(letters); // NullPointerException
    }
}

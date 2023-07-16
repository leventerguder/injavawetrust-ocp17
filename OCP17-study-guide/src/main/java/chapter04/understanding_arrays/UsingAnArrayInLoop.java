package chapter04.understanding_arrays;

public class UsingAnArrayInLoop {

    public static void main(String[] args) {

        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.print(numbers[i] + "  ");
        }

        // numbers[10] = 3; //ArrayIndexOutOfBoundsException


    }
}

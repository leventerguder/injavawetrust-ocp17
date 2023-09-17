package chapter11.recognizing_exception_classes;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
    }
}

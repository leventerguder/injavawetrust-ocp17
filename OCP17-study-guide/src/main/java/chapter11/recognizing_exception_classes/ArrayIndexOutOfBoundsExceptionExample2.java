package chapter11.recognizing_exception_classes;

public class ArrayIndexOutOfBoundsExceptionExample2 {

    public static void main(String[] args) {
        int[] countsOfMoose = new int[3];
        countsOfMoose[3] = 5;
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
    }
}

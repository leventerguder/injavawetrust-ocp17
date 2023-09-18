package chapter11.recognizing_exception_classes;

public class ArrayStoreExceptionExample {

    public static void main(String[] args) {

        Object[] array = new Integer[5];
        array[0] = 10;
        array[1] = "ArrayStoreException";

    }
}

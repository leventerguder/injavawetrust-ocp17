package chapter13.using_common_annotations.example05;

public class PossibleHeapPollutionV1 {

    // Possible heap pollution from parameterized vararg type T
    public static <T> void printValues(T... values) {
        for (T t : values) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        printValues("value1", "value2", "value3");
    }
}

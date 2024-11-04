package chapter13.using_common_annotations.example05;

public class PossibleHeapPollutionV2Fixed {

    @SafeVarargs
    public static <T> void printValues(T... values) {
        for (T t : values) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        printValues("value1", "value2", "value3");
    }
}

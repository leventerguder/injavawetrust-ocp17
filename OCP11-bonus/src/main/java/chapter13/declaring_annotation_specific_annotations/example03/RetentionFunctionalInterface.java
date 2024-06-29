package chapter13.declaring_annotation_specific_annotations.example03;

public class RetentionFunctionalInterface {

    public static void main(String[] args) {

        MyFunctionalInterface ref = () -> 10;
        System.out.println(ref.sample());

        // @FunctionalInterface has @Retention(RetentionPolicy.RUNTIME)
        // Check the compiled class (target folder)
    }
}
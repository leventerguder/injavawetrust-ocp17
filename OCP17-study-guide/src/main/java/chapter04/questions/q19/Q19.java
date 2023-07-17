package chapter04.questions.q19;

import java.util.Arrays;

public class Q19 {

    public static void main(String[] args) {

        String[] s1 = {"Camel", "Peacock", "Llama"};
        String[] s2 = {"Camel", "Llama", "Peacock"};
        String[] s3 = {"Camel"};
        String[] s4 = {"Camel", null};

        System.out.println(Arrays.compare(s1, s2));  //positive
        System.out.println(Arrays.mismatch(s1, s2)); //1
        System.out.println(Arrays.compare(s3, s4)); // negative
        System.out.println(Arrays.mismatch(s3, s4)); //1
        System.out.println(Arrays.compare(s4, s4)); // 0
        System.out.println(Arrays.mismatch(s4, s4)); // -1
    }
}

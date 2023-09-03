package chapter10.using_streams.using_common_terminal_operations;

import java.util.Arrays;
import java.util.Comparator;

public class StreamMinMaxExample3 {

    public static void main(String[] args) {

        stringCompareTo();

        lengthCompare();
    }

    private static void stringCompareTo() {
        String[] string = "you never know what you have until you clean your room".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());
    }
    private static void lengthCompare() {
        String[] string = "you never know what you have until you clean your room".split(" ");
        // Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(string).min(lengthCompare).get());
    }
}

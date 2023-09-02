package chapter10.using_streams.using_common_intermediate_operations;

import java.lang.reflect.Method;
import java.util.Arrays;

public class StreamMapExample4 {

    public static void main(String[] args) {

        Arrays.stream(Object.class.getMethods())    // source
                .map(Method::getName)               // intermediate op
                .distinct()                         // intermediate op
                .forEach(System.out::println);      // terminal operation

    }
}

package chapter11.questions.q09;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Q09 {

    public static void main(String[] args) {

        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<" + message + ">");
    }
}

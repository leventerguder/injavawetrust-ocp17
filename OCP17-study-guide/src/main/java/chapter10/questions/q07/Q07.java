package chapter10.questions.q07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q07 {

    private static List<String> sort(List<String> list) {
        var copy = new ArrayList<String>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    // There is no Stream<T> method called compare() or compareTo() !

//    private static List<String> optionA(List<String> list) {
//        return list.stream()
//                .compare((a, b) -> b.compareTo(a)) // There is no compare method!
//                .collect(Collectors.toList());
//    }

//    private static List<String> optionB(List<String> list) {
//        return list.stream()
//                .compare((a, b) -> b.compareTo(a)).sort(); // There is no compare method!
//    }

//    private static List<String> optionC(List<String> list) {
//        return list.stream()
//                .compareTo((a, b) -> b.compareTo(a)) // There is no compareTo method!
//                .collect(Collectors.toList());
//    }

//    private static List<String> optionD(List<String> list) {
//        return list.stream()
//                .compareTo((a, b) -> b.compareTo(a)) .sort(); // There is no compareTo method!
//    }

//    private static List<String> optionE(List<String> list) {
//        return list.stream()
//                .sorted((a, b) -> b.compareTo(a))
//                .collect(); // DOES NOT COMPILE
//    }

    private static List<String> optionF(List<String> list) {
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
}

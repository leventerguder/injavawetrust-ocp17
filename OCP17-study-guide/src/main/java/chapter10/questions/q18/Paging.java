package chapter10.questions.q18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Paging {
    record Sesame(String name, boolean human) {
        @Override
        public String toString() {
            return name();
        }
    }

    record Page(List<Sesame> list, long count) {
    }

    public static void main(String[] args) {
        var monsters = Stream.of(new Sesame("Elmo", false));
        var people = Stream.of(new Sesame("Abby", true));
        printPage(monsters, people);
    }

    private static void printPage(Stream<Sesame> monsters, Stream<Sesame> people) {
        Page page = Stream.concat(monsters, people)
                .collect(Collectors.teeing(
                        Collectors.filtering(s -> s.name().startsWith("E"), Collectors.toList()),
                        Collectors.counting(),
                        (l, c) -> new Page(l, c)));
        System.out.println(page);
    }
}
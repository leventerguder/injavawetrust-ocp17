package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByMapping4 {


    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("bob", 34),
                new Person("bob", 43),
                new Person("mary", 84),
                new Person("mary", 44),
                new Person("john", 12),
                new Person("bob", 22));

        System.out.println("Person list - " + personList);

        Stream<Person> personStream = personList.stream();

        Map<String, List<Integer>> result = personStream.collect(
                Collectors.groupingBy(p -> p.name,
                Collectors.mapping(e -> e.age, Collectors.toList())));

        System.out.println("Mapping result - " + result);
    }

    private record Person(String name, int age) {
    }
}

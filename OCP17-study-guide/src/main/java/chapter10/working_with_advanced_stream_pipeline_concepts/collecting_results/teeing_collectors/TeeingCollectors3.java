package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.teeing_collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeeingCollectors3 {

    public static void main(String[] args) {


        List<Item> items = List.of(
                new Item(1, "Keyboard", 1000),
                new Item(2, "Monitor", 2500),
                new Item(3, "Mouse", 500),
                new Item(4, "Tablet", 1200)
        );

        Map<String, Item> result = items.stream()
                .collect(
                        Collectors.teeing(
                                Collectors.minBy(Comparator.comparing(Item::price)),
                                Collectors.maxBy(Comparator.comparing(Item::price)),
                                (Optional<Item> e1, Optional<Item> e2) -> Map.ofEntries(
                                        Map.entry("min", e1.get()),
                                        Map.entry("max", e2.get())
                                )
                        )
                );

        System.out.println("Cheapest item: " + result.get("min").name());
        System.out.println("Most expensive item: " + result.get("max").name());

    }

    record Item(int id, String name, int price) {
    }
}
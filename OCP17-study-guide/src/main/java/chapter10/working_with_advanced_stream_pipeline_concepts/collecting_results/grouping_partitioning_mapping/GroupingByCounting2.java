package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCounting2 {

    public static void main(String[] args) {

        // https://stackabuse.com/guide-to-java-8-collectors-counting/

        List<Book> books = Arrays.asList(
                new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1954, 30),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 40),
                new Book("Animal Farm", "George Orwell", 1945, 37),
                new Book("Nineteen Eighty-Four", "George Orwell", 1949, 55),
                new Book("The Road to Wigan Pier", "George Orwell", 1937, 25),
                new Book("Lord of the Flies", "William Golding", 1954, 44)
        );

        Map<String, Long> soldCopiesStats = books
                .stream()
                .filter(book -> book.soldCopies() > 35)
                .collect(Collectors.groupingBy(Book::author, Collectors.counting()));

        System.out.println(soldCopiesStats);
    }

    private record Book(String title, String author, int releaseYear, int soldCopies) {
    }
}

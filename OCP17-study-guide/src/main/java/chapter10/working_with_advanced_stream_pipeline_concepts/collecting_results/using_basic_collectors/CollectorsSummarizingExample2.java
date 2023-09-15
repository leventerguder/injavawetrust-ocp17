package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorsSummarizingExample2 {
    static List<Employee> employeeList
            = Arrays.asList(new Employee("Tom Jones", 45, 15000.00, 190),
            new Employee("Tom Jones", 45, 7000.00, 220),
            new Employee("Ethan Hardy", 65, 8000.00, 1008),
            new Employee("Nancy Smith", 22, 10000.00, 5),
            new Employee("Deborah Sprightly", 29, 9000.00, 45));

    public static void main(String[] args) {
        //Using Collectors.summarizingInt()
        IntSummaryStatistics intSummaryStatistics = employeeList
                .stream()
                .collect(Collectors.summarizingInt(Employee::age));
        System.out.println("IntSummaryStatistics for age: " + intSummaryStatistics);

        //Using Collectors.summarizingLong()
        LongSummaryStatistics longSummaryStatistics = employeeList
                .stream()
                .collect(Collectors.summarizingLong(Employee::leaves));
        System.out.println("LongSummaryStatistics for leaves: " + longSummaryStatistics);

        //Using Collectors.summarizingDouble()
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList
                .stream()
                .collect(Collectors.summarizingDouble(Employee::salary));
        System.out.println("DoubleSummaryStatistics for salary: " + doubleSummaryStatistics);
    }

    public record Employee(String name, Integer age, Double salary, long leaves) {
    }
}
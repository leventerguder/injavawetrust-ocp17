package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByMapping3 {


    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Tom Jones", 45, 15000.00),
                new Employee("Harry Andrews", 45, 7000.00),
                new Employee("Ethan Hardy", 65, 8000.00),
                new Employee("Nancy Smith", 22, 10000.00),
                new Employee("Deborah Sprightly", 29, 9000.00)
        );

        collectorsMapping(employeeList);

        streamMap(employeeList);
    }

    private static void collectorsMapping(List<Employee> employeeList) {

        System.out.println("### collectorsMapping ###");
        List<String> employeeNames = employeeList
                .stream()
                .collect(Collectors.mapping(Employee::name, Collectors.toList()));
        System.out.println("List of employee names:" + employeeNames);
    }

    private static void streamMap(List<Employee> employeeList) {

        System.out.println("### streamMap ###");
        List<Integer> employeeNames = employeeList
                .stream().map(Employee::age).toList();
        System.out.println("List of employee names:" + employeeNames);
    }

    private record Employee(String name, Integer age, Double salary) {
    }
}

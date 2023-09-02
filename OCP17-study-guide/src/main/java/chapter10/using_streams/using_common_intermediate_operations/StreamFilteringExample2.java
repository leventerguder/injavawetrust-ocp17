package chapter10.using_streams.using_common_intermediate_operations;

import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringExample2 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "jack", 1000);
        Employee employee2 = new Employee(2, "john", 2000);
        Employee employee3 = new Employee(3, "anna", 3000);
        Employee employee4 = new Employee(4, "daniel", 4000);

        Stream<Employee> employeeStream = Stream.of(employee1, employee2, employee3, employee4);

        employeeStream.filter(emp -> emp.salary() > 2500).forEach(System.out::println);
    }
}

record Employee(int id, String name, int salary) {

}

package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeExample {

    public static void main(String[] args) {

        Employee employee1 = new Employee(10, "Thomas", "Smith");
        Employee employee2 = new Employee(18, "Thomas", "Oliver");
        Employee employee3 = new Employee(7, "Johnson", "Williams");
        Employee employee4 = new Employee(27, "Johnson", "Duke");
        Employee employee5 = new Employee(37, "Johnson", "Mill");
        Employee employee6 = new Employee(6, "Jones", "Brown");
        Employee employee7 = new Employee(8, "Lopez", "Hernandez");
        Employee employee8 = new Employee(15, "Anderson", "Wilson");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        System.out.println("### Before Collections.sort ### ");
        employees.forEach(System.out::println);

        Collections.sort(employees);

        System.out.println("### After Collections.sort ### ");
        employees.forEach(System.out::println);
    }
}

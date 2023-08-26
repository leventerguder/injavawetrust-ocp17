package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeExample {

    public static void main(String[] args) {

        Employee employee1 = new Employee(10, "Thomas", "Smith");
        Employee employee2 = new Employee(7, "Johnson", "Williams");
        Employee employee3 = new Employee(6, "Jones", "Brown");
        Employee employee4 = new Employee(8, "Lopez", "Hernandez");
        Employee employee5 = new Employee(15, "Anderson", "Wilson");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println("### Before Collections.sort ### ");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("### After Collections.sort ### ");
        System.out.println(employees);
    }
}

package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeV2Example {

    public static void main(String[] args) {

        EmployeeV2 employee1 = new EmployeeV2(10, "Thomas", "Smith", 1000);
        EmployeeV2 employee2 = new EmployeeV2(25, "Thomas", "Jane", 780);
        EmployeeV2 employee3 = new EmployeeV2(7, "Johnson", "Williams", 1400.25);
        EmployeeV2 employee4 = new EmployeeV2(5, "Jones", "Brown", 950.78);
        EmployeeV2 employee5 = new EmployeeV2(6, "Jones", "Black", 1950);
        EmployeeV2 employee6 = new EmployeeV2(8, "Lopez", "Hernandez", 1200);
        EmployeeV2 employee7 = new EmployeeV2(15, "Anderson", "Wilson", 900);

        List<EmployeeV2> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);

        Comparator<EmployeeV2> c = Comparator.comparing(EmployeeV2::getFirstName)
                .thenComparingDouble(EmployeeV2::getSalary);

        Collections.sort(employees, c);

        employees.forEach(System.out::println);
    }
}

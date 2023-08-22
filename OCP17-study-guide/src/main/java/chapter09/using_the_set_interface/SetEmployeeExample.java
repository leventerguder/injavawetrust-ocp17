package chapter09.using_the_set_interface;

import java.util.HashSet;

public class SetEmployeeExample {

    public static void main(String[] args) {


        Employee employee1 = new Employee(1, "ahmet", "yilmaz", 25);
        Employee employee2 = new Employee(1, "ahmet", "yilmaz", 25);
        Employee employee3 = new Employee(1, "ahmet", "yilmaz", 25);

        System.out.println("Employee1 == Employee1 : " + (employee1 == employee1)); // true
        System.out.println("Employee1 == Employee2 : " + (employee1 == employee2)); // false
        System.out.println("Employee1 == Employee3 : " + (employee1 == employee3)); // false
        System.out.println("Employee1.equals(Employee2) : " + employee1.equals(employee2)); // true


        HashSet<Employee> employeesSet = new HashSet<>();

        System.out.println(employeesSet.add(employee1)); // true
        System.out.println(employeesSet.add(employee2)); // false
        System.out.println(employeesSet.add(employee3)); // false
        System.out.println(employeesSet.add(employee1)); // false
        System.out.println(employeesSet.add(employee1)); // false
        System.out.println(employeesSet.add(new Employee(1, "ahmet", "yilmaz", 25))); // false

        System.out.println("Employees.size() : " + employeesSet.size()); //1
        System.out.println(employeesSet);

        System.out.println(employeesSet.remove(new Employee(1, "ahmet", "yilmaz", 25))); //true
        System.out.println(employeesSet.remove(employee1)); // false
        System.out.println(employeesSet.remove(employee2)); // false

        System.out.println(employeesSet.size()); //0
        System.out.println(employeesSet); // []
    }
}

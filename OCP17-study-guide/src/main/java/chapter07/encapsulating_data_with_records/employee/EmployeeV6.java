package chapter07.encapsulating_data_with_records.employee;

import java.util.List;

public record EmployeeV6(String name, List<String> emails) {

    public EmployeeV6 {
        name = name.toUpperCase();
        System.out.println("compact-constructor");
    }

    public EmployeeV6(String name) {
        this(name, List.of("guest@injavawetrust.com"));
        System.out.println("constructor");
    }
}

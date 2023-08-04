package chapter07.encapsulating_data_with_records.employee;

import java.util.List;

public record EmployeeV2(String name, List<String> emails) {

    // Compact constructor access level cannot be more restrictive than the record access level ('public')
//        EmployeeV2{
//
//        }

    // Canonical constructor access level cannot be more restrictive than the record access level ('public')
    // EmployeeV2(String name, List<String> emails) {}

    public EmployeeV2(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    // Non-canonical record constructor must delegate to another constructor
    public EmployeeV2(String name) {
//        this.emails = List.of();
//        this.name = name;
        this(name, List.of());
    }
}

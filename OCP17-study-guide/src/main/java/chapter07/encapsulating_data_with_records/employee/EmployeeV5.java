package chapter07.encapsulating_data_with_records.employee;

import java.util.ArrayList;
import java.util.List;

public record EmployeeV5(String name, List<String> emails) {

    public EmployeeV5 {
        emails = new ArrayList<>(emails);
        name = name.concat(" suffix");
        System.out.println("compact-constructor");
    }

    // 'EmployeeV5(String, List<String>)' is already defined in
    // 'chapter07.encapsulating_data_with_records.employee.EmployeeV5'
//    public EmployeeV5(String name, List<String> emails) {
//        this.name = name;
//        this.emails = emails;
//        System.out.println("canonical-constructor");
//    }

}

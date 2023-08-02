package chapter07.encapsulating_data_with_records.employee;

import java.util.ArrayList;
import java.util.List;

public record EmployeeV3(String name, List<String> emails) {
    public EmployeeV3 {
        emails = new ArrayList<>(emails);
    }
}

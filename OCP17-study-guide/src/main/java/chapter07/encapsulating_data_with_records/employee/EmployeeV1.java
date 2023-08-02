package chapter07.encapsulating_data_with_records.employee;

import java.util.List;
public record EmployeeV1(String name, List<String> emails) {
}

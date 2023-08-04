package chapter07.encapsulating_data_with_records.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeV5Test {

    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("email1@injavawetrust.com");
        emails.add("email2@injavawetrust.com");


        EmployeeV5 employee = new EmployeeV5("emp-name", emails);

        System.out.println(employee);
    }
}

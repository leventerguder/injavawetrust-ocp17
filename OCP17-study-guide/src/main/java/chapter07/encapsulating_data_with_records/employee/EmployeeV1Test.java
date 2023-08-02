package chapter07.encapsulating_data_with_records.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeV1Test {

    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("email1@injavawetrust.com");
        emails.add("email2@injavawetrust.com");


        EmployeeV1 employee = new EmployeeV1("emp-name", emails);

        System.out.println(employee);

        emails.clear();

        System.out.println(employee);
    }
}

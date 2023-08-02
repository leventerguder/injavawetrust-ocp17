package chapter07.encapsulating_data_with_records.employee;

import java.util.ArrayList;
import java.util.List;

public record EmployeeV4(String name, List<String> emails) {

    public EmployeeV4 {
        emails = new ArrayList<>(emails);
        name = name.concat(" suffix");
        name = name.concat(" more suffix");
        System.out.println("compact-constructor");
        method();
        method2();
    }

    void method() {
        System.out.println("method-1");
    }

    static void method2() {
        System.out.println("static-method-1");
    }
}

package chapter05.accessing_static_data;

import static java.lang.Integer.MAX_VALUE;
// import static java.lang.Long.MAX_VALUE;
// Field 'MAX_VALUE' is already defined in a single static import
// Reference to 'MAX_VALUE' is ambiguous, both 'Integer.MAX_VALUE' and 'Long.MAX_VALUE'
public class StaticImportSameName {

    public static void main(String[] args) {

        System.out.println(MAX_VALUE);

    }
}

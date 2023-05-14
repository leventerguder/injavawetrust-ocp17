package chapter03.applying_switch_statements;

public class SelectingSwitchDataTypes {

    public static void main(String[] args) {

        // The following is a list of all data types supported by switch statements:

        // int and Integer
        // byte and Byte
        // short and Short
        // char and Character
        // String
        // enum values
        // var (if the type resolves to one of the preceding types)

        // Notice that boolean, long, float, and double are excluded from switch statements,
        // as are their associated Boolean, Long, Float, and Double classes.

        int number = 10;
        switch (number){

        }

        Integer number2 = 10;
        switch (number2){

        }

        short number3 = 10;
        switch (number3){

        }

        String str = "switch-sample";
        switch (str){

        }

        boolean bool = true;
        // switch (bool){} // Compile Error

        float number4 = 10;
        // switch (number4){} // Compile Error
    }
}

package chapter05.questions.q19;

public class Order3 {
    final String value1 = "red";
    static String value2 = "blue";
    String value3 = "yellow";

    {
        //   value1 = "green"; //DOES NOT COMPILE
        value2 = "purple";
        value3 = "orange";
    }

    static {
        // value1 = "magenta"; // DOES NOT COMPILE
        value2 = "cyan";
        // value3 = "turquoise"; // DOES NOT COMPILE
    }
}

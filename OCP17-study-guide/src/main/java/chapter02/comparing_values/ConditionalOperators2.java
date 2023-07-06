package chapter02.comparing_values;

public class ConditionalOperators2 {

    public static void main(String[] args) {


        String str = method();

        if (str != null && str.equals("sample")) {

        }

        if ("sample".equals(str)) { //better

        }


    }

    private static String method() {
        return null;
    }
}

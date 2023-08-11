package chapter08.writing_simple_lambdas;

public interface InvalidLambdas {

    public static void main(String[] args) {

        //Interface1 v1 = x, y -> x.startsWith("fish");
        Interface1 v1 = (x, y) -> x.startsWith("fish");

        // Interface2 v2 = x -> { x.startsWith("camel"); };
        Interface2 v2 = x -> {
            return x.startsWith("camel");
        };

        //Interface2 v22 = x -> { return x.startsWith("giraffe") };
        Interface2 v22 = x -> {
            return x.startsWith("giraffe");
        };

        // Interface2 v23 = String x -> x.endsWith("eagle");
        Interface2 v23 = (String x) -> x.endsWith("eagle");

    }

}

interface Interface1 {

    boolean sample(String str1, String str2);
}

interface Interface2 {

    boolean sample(String str);
}
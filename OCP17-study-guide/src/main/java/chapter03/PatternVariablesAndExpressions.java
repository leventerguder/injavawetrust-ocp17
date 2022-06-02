package chapter03;

public class PatternVariablesAndExpressions {

    public static void main(String[] args) {
        printIntegersGreaterThan5(10);
        printIntegersGreaterThan5(4);
        printIntegersGreaterThan5(24);
    }

    static void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.println(data);
    }
}

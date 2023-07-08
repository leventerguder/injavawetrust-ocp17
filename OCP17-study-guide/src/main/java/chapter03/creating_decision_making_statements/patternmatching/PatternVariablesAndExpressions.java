package chapter03.creating_decision_making_statements.patternmatching;

public class PatternVariablesAndExpressions {

    void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.println(data);
    }

    public static void main(String[] args) {
        PatternVariablesAndExpressions pv = new PatternVariablesAndExpressions();
        pv.printIntegersGreaterThan5(10);
        pv.printIntegersGreaterThan5(15);
        pv.printIntegersGreaterThan5(3);
    }
}

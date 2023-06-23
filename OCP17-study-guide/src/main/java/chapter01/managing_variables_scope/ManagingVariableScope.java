package chapter01.managing_variables_scope;

public class ManagingVariableScope {

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }
    // There are two variables with local scope. The bitesOfCheese variable is declared inside the method.
    // The piecesOfCheese variable is a method parameter.
    // Neither variable can be used outside of where it is defined.
}

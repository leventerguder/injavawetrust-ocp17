package chapter02.working_with_binary_arithmetic_operators;

public class NumericPromotion {

    private void promotion1() {

        int x = 1;
        long y = 33;
        var z = x * y;

        // Since one of the values is int and the other is long, and long is larger than int, the int value x is first promoted to a long.
        // The result z is then a long value.
    }

    private void promotion2() {

        double x = 39.21;
        //float y = 2.1; // COMPILE ERROR
        //floating-point literals are assumed to be double unless post- fixed with an f, as in 2.1f
        float y = 2.1f;
        var z = x + y;
    }

    private void promotion3() {
        short x = 10;
        short y = 3;
        var z = x * y;

        // that x and y will both be promoted to int before the binary multiplication operation, resulting in an output of type int.
    }

    private void promotion4() {
        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y;

        // First, w will automatically be promoted to int solely because it is a short and is being used in an arithmetic binary operation.
        // The promoted w value will then be automatically promoted to a float so that it can be multiplied with x.
        // The result of w * x will then be automatically promoted to a double so that it can be divided by y, resulting in a double value.
    }
}

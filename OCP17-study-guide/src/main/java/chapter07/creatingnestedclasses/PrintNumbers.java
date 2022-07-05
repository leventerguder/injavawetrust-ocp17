package chapter07.creatingnestedclasses;

public class PrintNumbers {

    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
//            public int multiply() {
//                return length * width * height; // DOES NOT COMPILE
//            }
        }
        width = 2;

        // The length and height variables are final and effectively final, respectively, so neither causes a compilation issue.
        // On the other hand, the width variable is reassigned during the method, so it cannot be effectively final.
        // For this reason, the local class declaration does not compile.
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // 100
    }
}
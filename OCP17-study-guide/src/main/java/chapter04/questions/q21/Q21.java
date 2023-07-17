package chapter04.questions.q21;

public class Q21 {

    public static void main(String[] args) {


        method1();
        method2();
        method3();
        //method4(); // StringIndexOutOfBoundsException
    }

    private static void method1() {
        var puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);
    }


    private static void method2() {
        var puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").substring(0, 4);
        System.out.println(puzzle);
    }

    private static void method3() {
        var puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println(puzzle);
    }

    private static void method4() {
        var puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
        System.out.println(puzzle);
    }


}

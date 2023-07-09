package chapter03.questions.q15;

public class Q15 {

    public static void main(String[] args) {

        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B':
                // 'C':System.out.print("great "); // DOES NOT COMPILE
            case 'D':
                System.out.print("good ");
                break;
            case e:
            case 'F':
                System.out.print("not good ");
        }
    }
}

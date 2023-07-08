package chapter03.creating_decision_making_statements;

public class ElseStatement {

    public static void main(String[] args) {

        int hourOfDay = 20;


        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }


        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon-duplicate");
        } else {
            System.out.println("Good Evening");
        }
    }
}

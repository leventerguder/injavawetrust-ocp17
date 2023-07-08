package chapter03.applying_switch_statements.statement;

public class ApplyingSwitchStatements2 {


    private void switchStatements() {
        int month = 5;

//        switch month { // DOES NOT COMPILE
//            case 1:
//                System.out.print("January");
//        }

//        switch (month) // DOES NOT COMPILE
//        case 1:
//        System.out.print("January");
//
//        switch (month) {
//            case 1 : 2:System.out.print("January"); // DOES NOT COMPILE
//        }

        //The first switch statement does not compile because it is missing parentheses around the switch variable.
        //The second statement does not compile because it is missing braces around the switch body.
        //The third statement does not compile because a comma (,) should be used to separate combined case statements, not a colon(:).

        //  The switch statement is not required to contain any case statements.
        switch (month) {
        }
    }
}

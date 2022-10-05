package chapter03.applying_switch_statements;

public class SwitchExpression2 {

    private static void semicolonRequired(int bear) {

//        var result = switch (bear) {
//            case 30 -> "Grizzly"
//            default -> "Panda"
//        }

        var result = switch (bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };
        System.out.println(result);
    }
}

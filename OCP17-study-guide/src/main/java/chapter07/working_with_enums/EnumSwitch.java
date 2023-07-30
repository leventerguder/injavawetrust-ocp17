package chapter07.working_with_enums;

public class EnumSwitch {

    public static void main(String[] args) {

        switchStatementEnum();

        System.out.println();
        switchExpressionValid();
    }

    private static void switchStatementEnum() {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");

        }
    }


    static void switchExpressionInvalid() {
//        Season summer = Season.SUMMER;
//        var message = switch (summer) {
//            case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
//            case 0 -> "Time for the pool!"; // DOES NOT COMPILE
//            default -> "Is it summer yet?";
//        };
//        System.out.print(message);
    }

    static void switchExpressionValid() {
        Season summer = Season.SUMMER;
        var message = switch (summer) {
            case WINTER -> "Get out the sled!";
            case SUMMER -> "Time for the pool!";
            default -> "Is it summer yet?";
        };
        System.out.print(message);
    }
}

package chapter07.working_with_enums;

public class EnumSwitch {

    public static void main(String[] args) {

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


    void compileError() {
//        Season summer = Season.SUMMER;
//        var message = switch (summer) {
//            case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
//            case 0 -> "Time for the pool!"; // DOES NOT COMPILE
//            default -> "Is it summer yet?";
//        };
//        System.out.print(message);
    }
}

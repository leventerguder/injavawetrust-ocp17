package chapter03.applying_switch_statements;

public class SwitchExpressionMissingSemicolons {

    public static void main(String[] args) {


        int fish = 1;
        /*
        var name = switch (fish) {
            case 1 -> "Goldfish" // DOES NOT COMPILE (missing semicolon)
            case 2 -> {
                yield "Trout";
            }; // DOES NOT COMPILE (extra semicolon)
        } // DOES NOT COMPILE (missing semicolon)

        */

        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            default -> throw new IllegalStateException("Unexpected value: " + fish);
        };

        System.out.println(name);

    }
}

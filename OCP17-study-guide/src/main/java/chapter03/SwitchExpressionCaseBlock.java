package chapter03;

public class SwitchExpressionCaseBlock {

    public static void main(String[] args) {
        yieldRequired();
    }

    private static void yieldRequired() {
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };

        System.out.println(name);
        /*
        The yield keyword is equivalent to a return statement within a switch expression and is used to avoid ambiguity about
        whether you meant to exit the block or method around the switch expression.
         */
    }
    // yield statements are not optional if the switch statement returns a value.
}

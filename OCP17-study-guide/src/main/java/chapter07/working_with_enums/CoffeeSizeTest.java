package chapter07.working_with_enums;

public class CoffeeSizeTest {
    public static void main(String[] args) {

        System.out.println(CoffeeSize.TALL);
        System.out.println(CoffeeSize.TALL);

        System.out.println(CoffeeSize.TALL instanceof CoffeeSize);
        System.out.println(CoffeeSize.SHORT instanceof Enum<CoffeeSize>);
    }
}

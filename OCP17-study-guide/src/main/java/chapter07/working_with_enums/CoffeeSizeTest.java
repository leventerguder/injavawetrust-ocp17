package chapter07.working_with_enums;

import java.io.Serializable;

public class CoffeeSizeTest {
    public static void main(String[] args) {

        System.out.println(CoffeeSize.TALL);
        System.out.println(CoffeeSize.TALL);

        System.out.println(CoffeeSize.TALL instanceof CoffeeSize);
        System.out.println(CoffeeSize.SHORT instanceof Enum<CoffeeSize>);
        System.out.println(CoffeeSize.SHORT instanceof Serializable);
        System.out.println(CoffeeSize.SHORT instanceof Comparable<?>);
    }
}

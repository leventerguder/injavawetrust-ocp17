package chapter07.working_with_enums;

public class CreatingSimpleEnums {

    public static void main(String[] args) {

        var s = Season.SUMMER;
        System.out.println(Season.SUMMER); //SUMMER
        System.out.println(s == Season.SUMMER); // true
        System.out.println(s.equals(Season.SUMMER));
    }
}

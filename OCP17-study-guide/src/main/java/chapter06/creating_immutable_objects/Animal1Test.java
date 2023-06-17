package chapter06.creating_immutable_objects;

public class Animal1Test {

    public static void main(String[] args) {

        var zebra = new Animal1();
        System.out.println(zebra.getFavoriteFoods()); // [Apples]

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoods()); // [Chocolate Chip Cookies]
    }
}

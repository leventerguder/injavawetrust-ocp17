package chapter06.creatingimmutableobjects;

public class Animal2Test {

    public static void main(String[] args) {


        var zebra = new Animal2();
        System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]

        //zebra.getFavoriteFoods().clear();
    }
}

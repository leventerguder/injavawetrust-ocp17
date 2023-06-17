package chapter06.creating_immutable_objects;

import java.util.ArrayList;

public class Animal5Test {

    public static void main(String[] args) {

        var favorites = new ArrayList<String>();
        favorites.add("Apples");

        var zebra = new Animal5(favorites);
        System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]

        favorites.clear();
        favorites.add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]

        // The copy operation is called a defensive copy because the copy is being made in case other code does something unexpected.
    }
}

package chapter06.creating_immutable_objects;

import java.util.ArrayList;

public class Animal4Test {

    public static void main(String[] args) {

        var favorites = new ArrayList<String>();
        favorites.add("Apples");

        var zebra = new Animal4(favorites);  // Caller still has access to favorites
        System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]

        favorites.clear();
        favorites.add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoodsItem(0)); // [Chocolate Chip Cookies]
        // It seems like Animal is not immutable anymore, since its contents can change after it is created.
    }
}

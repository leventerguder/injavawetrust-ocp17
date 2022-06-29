package chapter06.creatingimmutableobjects;

import java.util.ArrayList;
import java.util.List;

// An immutable object declaration
public class Animal2 {

    private final List<String> favoriteFoods;

    public Animal2() {
        this.favoriteFoods = new ArrayList<>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }

}

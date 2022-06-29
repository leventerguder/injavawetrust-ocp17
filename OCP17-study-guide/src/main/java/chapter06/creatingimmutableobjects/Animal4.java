package chapter06.creatingimmutableobjects;

import java.util.List;

// // Not an immutable object declaration
public class Animal4 {

    private final List<String> favoriteFoods;

    public Animal4(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = favoriteFoods;
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }

}

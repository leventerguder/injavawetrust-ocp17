package chapter06.creating_immutable_objects;

import java.util.ArrayList;
import java.util.List;

// An immutable object declaration
public class Animal3 {

    private final List<String> favoriteFoods;

    public Animal3() {
        this.favoriteFoods = new ArrayList<>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public ArrayList<String> getFavoriteFoods() {
        return new ArrayList<String>(this.favoriteFoods);
    }

}

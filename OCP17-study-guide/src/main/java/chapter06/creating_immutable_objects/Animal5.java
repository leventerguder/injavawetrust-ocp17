package chapter06.creating_immutable_objects;

import java.util.ArrayList;
import java.util.List;

// // Not an immutable object declaration
public class Animal5 {

    private final List<String> favoriteFoods;

    public Animal5(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        //this.favoriteFoods = favoriteFoods;
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
        // The copy operation is called a defensive copy because the copy is being made in case other code does something unexpected.
        // It’s the same idea as defensive driving: prevent a problem before it exists.

    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }

}

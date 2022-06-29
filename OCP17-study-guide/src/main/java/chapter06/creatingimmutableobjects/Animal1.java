package chapter06.creatingimmutableobjects;

import java.util.ArrayList;
import java.util.List;

// Not an immutable object declaration
public final class Animal1 {

    private final ArrayList<String> favoriteFoods;

    public Animal1() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}

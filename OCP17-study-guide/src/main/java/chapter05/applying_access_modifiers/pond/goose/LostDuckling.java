package chapter05.applying_access_modifiers.pond.goose;

import chapter05.applying_access_modifiers.pond.duck.DuckTeacher;

public class LostDuckling {

    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.print("Thanks" + teacher.name); // allowed
    }
}

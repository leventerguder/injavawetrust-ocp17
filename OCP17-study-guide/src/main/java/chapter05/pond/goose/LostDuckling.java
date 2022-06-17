package chapter05.pond.goose;

import chapter05.pond.duck.DuckTeacher;

public class LostDuckling {

    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.print("Thanks" + teacher.name); // allowed
    }
}

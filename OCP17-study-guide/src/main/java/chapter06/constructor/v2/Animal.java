package chapter06.constructor.v2;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
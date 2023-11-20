package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.Serializable;

public class Cat implements Serializable {

    private String name;

    private int age;

    private String color = "white";

    public Cat() {
        System.out.println("No arg constructor...");
    }

    public Cat(String name, int age, String color) {
        System.out.println("All arg constructor...");
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

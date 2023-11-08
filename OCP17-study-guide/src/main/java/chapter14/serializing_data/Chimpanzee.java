package chapter14.serializing_data;

import java.io.Serializable;

public class Chimpanzee implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    {
        this.age = 14;
    }

    public Chimpanzee() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Chimpanzee(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static char getType() {
        return type;
    }

    public static void setType(char type) {
        Chimpanzee.type = type;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

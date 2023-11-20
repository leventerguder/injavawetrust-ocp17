package chapter14.serializing_data.understanding_the_deserialization_creation_process;

public class Animal {

    private int id;

    private String type;

    public Animal() {
        id = -1;
        type = "invalid-type";
        System.out.println("Animal no-arg constructor!!");
    }

    public Animal(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}

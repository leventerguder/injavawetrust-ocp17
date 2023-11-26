package chapter14.questions.q06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Eagle extends Bird implements Serializable {
    {
        this.name = "Olivia";
    }

    public Eagle() {
        this.name = "Bridget";
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var e = new Eagle();
        e.name = "Adeline";


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("eagles.serial"));
        objectOutputStream.writeObject(e);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("eagles.serial"));
        Eagle eagle = (Eagle) objectInputStream.readObject();
        System.out.println(eagle.name);

        // The key here is that while Eagle is serializable, its parent class Bird, is not.
        // Therefore, none of the members of Bird will be serialized.

        // During deserialization, Java calls the constructor of the first non-serializable parent.
        // None of teh constructor or instance initializers in Eagle are executed as part of deserialization.
    }
}
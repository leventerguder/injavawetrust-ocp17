package chapter14.serializing_data.understanding_the_deserialization_creation_process;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingDataExample2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var objectOutputStream = new ObjectOutputStream(new FileOutputStream("cat.serial"));

        Cat cat = new Cat("tekir", 2, "black", 10, "domestic");

        objectOutputStream.writeObject(cat);
        objectOutputStream.close();


        var objectInputStream = new ObjectInputStream(new FileInputStream("cat.serial"));
        Cat deserializedCat = (Cat) objectInputStream.readObject();
        System.out.println(deserializedCat);

    }


}

package chapter14.serializing_data.understanding_the_deserialization_creation_process;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingDataExample1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Collar collar = new Collar(3);
        Dog dog = new Dog(collar, 8);

        System.out.println("before serialization...");
        System.out.println(dog);

        var objectOutputStream = new ObjectOutputStream(new FileOutputStream("testSer.ser"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSer.ser"));
        Dog deserializedDog = (Dog) ois.readObject();
        ois.close();

        System.out.println("after deserialization...");
        System.out.println(deserializedDog);

    }


}

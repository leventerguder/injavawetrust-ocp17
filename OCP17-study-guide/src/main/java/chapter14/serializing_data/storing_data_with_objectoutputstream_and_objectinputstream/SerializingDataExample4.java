package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingDataExample4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var objectOutputStream = new ObjectOutputStream(new FileOutputStream("bird.serial"));

        Bird bird = new Bird(10, "eagle", null);
        //Bird bird = new Bird(10, "eagle", new Wing(10)); // NotSerializableException

        objectOutputStream.writeObject(bird);
        objectOutputStream.close();


        var objectInputStream = new ObjectInputStream(new FileInputStream("bird.serial"));
        Bird deserializedBird = (Bird) objectInputStream.readObject();
        System.out.println(deserializedBird);
        objectInputStream.close();

    }


}

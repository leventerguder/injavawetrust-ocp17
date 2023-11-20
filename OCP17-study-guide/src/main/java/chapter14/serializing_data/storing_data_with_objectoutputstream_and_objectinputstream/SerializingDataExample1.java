package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingDataExample1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var objectOutputStream = new ObjectOutputStream(new FileOutputStream("cat.serial"));

        Cat cat = new Cat("tekir", 2, "black");

        objectOutputStream.writeObject(cat);
        objectOutputStream.close();


        var objectInputStream = new ObjectInputStream(new FileInputStream("cat.serial"));
        Cat deserializedCat = (Cat) objectInputStream.readObject();
        System.out.println(deserializedCat);
        objectInputStream.close();
    }


}

package chapter14.questions.q22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Zebra implements Serializable {

    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    List<Zebra> friends = new java.util.ArrayList<>();
    private transient Object stripes = new Object();

    {
        age = 10;
    }

    public Zebra() {
        this.name = "Sophia";
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                ", stripes=" + stripes +
                ", birthPlace=" + Zebra.birthPlace +
                '}';
    }

    static Zebra writeAndRead(Zebra z) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("zebra.serial"));
        objectOutputStream.writeObject(z);

        // java.io.NotSerializableException: java.lang.Object

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("zebra.serial"));
        Zebra readZebra = (Zebra) objectInputStream.readObject();
        System.out.println(readZebra);

        return readZebra;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var zebra = new Zebra();
        zebra = writeAndRead(zebra);
    }
}

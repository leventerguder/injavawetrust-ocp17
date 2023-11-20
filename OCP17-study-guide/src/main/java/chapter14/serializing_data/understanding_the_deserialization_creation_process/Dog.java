package chapter14.serializing_data.understanding_the_deserialization_creation_process;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {
    private transient Collar collar; // we can't serialize this!
    private int dogSize;

    public Dog(Collar collar, int dogSize) {
        this.collar = collar;
        this.dogSize = dogSize;
    }

    public Collar getCollar() {
        return collar;
    }

    public int getDogSize() {
        return dogSize;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collar=" + collar +
                ", dogSize=" + dogSize +
                '}';
    }


    // writeObject() can throw exceptions.
    private void writeObject(ObjectOutputStream os) { // throws IOException
        try {
            System.out.println("invoking writeObject...");
            os.defaultWriteObject();
            // When you invoke defaultWriteObject() from within writeObject() you're telling
            // the JVM to do the normal serialization process for this object.

            // When implementing writeObject(), you will typically request
            // he normal serialization process, and do some custom writing and reading too.
            os.writeInt(collar.getCollarSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) { //   throws IOException, ClassNotFoundException {
        try {
            System.out.println("invoking readObject...");
            is.defaultReadObject();

            // When it's time to deserialize, defaultReadObject() handles the normal
            //deserialization you'd get if you didn't implement a readObject() method.

            collar = new Collar(is.readInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

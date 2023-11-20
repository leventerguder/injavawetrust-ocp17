package chapter14.serializing_data.storing_data_with_objectoutputstream_and_objectinputstream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StoringData {

    void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {

        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }

    }

    List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla g)
                    gorillas.add(g);
            }
        } catch (EOFException e) { // File end reached
            System.out.println("End of file...");
        }
        return gorillas;
    }
}

package chapter14.serializing_data.understanding_the_deserialization_creation_process;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StoringData {

    void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {

        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
        }

    }

    List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee g)
                    gorillas.add(g);
            }
        } catch (EOFException e) { // File end reached
            System.out.println("End of file...");
        }
        return gorillas;
    }
}

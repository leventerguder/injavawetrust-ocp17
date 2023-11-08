package chapter14.serializing_data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializingDataExample1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var gorillas = new ArrayList<Gorilla>();
        gorillas.add(new Gorilla("Grodd", 5, false));
        gorillas.add(new Gorilla("Ishmael", 8, true));
        File dataFile = new File("gorilla.data");

        StoringData storingData = new StoringData();

        storingData.saveToFile(gorillas, dataFile);
        var gorillasFromDisk = storingData.readFromFile(dataFile);
        System.out.print(gorillasFromDisk);

    }
}

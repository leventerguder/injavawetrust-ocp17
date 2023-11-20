package chapter14.serializing_data.understanding_the_deserialization_creation_process;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializingDataExample1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        File dataFile = new File("chimpanzee.data");


        StoringData storingData = new StoringData();
        storingData.saveToFile(chimpanzees, dataFile);

        var chimpanzeesFromDisk = storingData.readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }
}

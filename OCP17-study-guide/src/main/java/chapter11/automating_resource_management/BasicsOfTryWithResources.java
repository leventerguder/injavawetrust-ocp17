package chapter11.automating_resource_management;

import java.io.FileInputStream;
import java.io.IOException;

public class BasicsOfTryWithResources {


    public static void main(String[] args) throws IOException {
        var ref = new BasicsOfTryWithResources();
        ref.readFile();
    }

    public void readFile() throws IOException {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        }
    }

    /*
    A try-with-resources statement differs from a try statement in
    that neither of these is required, although a developer may add both.
     */

    public void readFileV2() {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            System.out.println("catch...");
        } finally {
            System.out.println("finally...");
        }
    }
    // you need to know that the implicit finally block runs before
    // any programmer-coded ones.
}

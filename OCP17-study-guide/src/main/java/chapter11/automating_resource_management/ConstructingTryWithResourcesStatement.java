package chapter11.automating_resource_management;

import java.io.FileWriter;
import java.io.IOException;

public class ConstructingTryWithResourcesStatement {

    // Only classes that implement the AutoCloseable interface
    // can be used in a try-with-resources statement.

    public static void main(String[] args) throws IOException {

//        try (String reptile = "lizard") {
//        } // DOES NOT COMPILE

        try (FileWriter fileWriter = new FileWriter("newFile.txt")) {
        }
    }
}

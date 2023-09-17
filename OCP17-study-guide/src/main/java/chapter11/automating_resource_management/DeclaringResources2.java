package chapter11.automating_resource_management;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DeclaringResources2 {

    public static void main(String[] args) throws IOException {


        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) { // Process file
        }

    }
}

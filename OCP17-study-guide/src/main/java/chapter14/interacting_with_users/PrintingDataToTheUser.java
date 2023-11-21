package chapter14.interacting_with_users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintingDataToTheUser {

    public static void main(String[] args) {

        try (var in = new FileInputStream("zoo.txt")) {
            System.out.println("Found file!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println("IOException!");
        }
    }
}

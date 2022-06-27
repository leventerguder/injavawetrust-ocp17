package chapter06.inheritingmembers;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {
    }

    // public void hide() throws FileNotFoundException {} // DOES NOT COMPILE

    // public void exitShell() throws IOException {} // DOES NOT COMPILE

}
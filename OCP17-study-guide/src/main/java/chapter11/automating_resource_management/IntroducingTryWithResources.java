package chapter11.automating_resource_management;

import java.io.FileInputStream;
import java.io.IOException;

public class IntroducingTryWithResources {


    public static void main(String[] args) {
        var ref = new IntroducingTryWithResources();
        ref.readFile("sample.txt");
        ref.readFileV2("sample-v2.txt");
    }
    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readFileV2(String file) {
        try (FileInputStream is = new FileInputStream(file)) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
